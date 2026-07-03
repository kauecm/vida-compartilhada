package com.kminfo.vida_compartilhada.services;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.kminfo.vida_compartilhada.configs.services.exceptions.EmailAlreadyRegisteredException;
import com.kminfo.vida_compartilhada.entities.CareGroup;
import com.kminfo.vida_compartilhada.entities.CareGroupUser;
import com.kminfo.vida_compartilhada.entities.Patient;
import com.kminfo.vida_compartilhada.entities.User;
import com.kminfo.vida_compartilhada.entities.dtos.RegisterRequest;
import com.kminfo.vida_compartilhada.entities.enuns.CareGroupRole;
import com.kminfo.vida_compartilhada.entities.enuns.UserRole;
import com.kminfo.vida_compartilhada.repositories.CareGroupRepository;
import com.kminfo.vida_compartilhada.repositories.CareGroupUserRepository;
import com.kminfo.vida_compartilhada.repositories.PatientRepository;
import com.kminfo.vida_compartilhada.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class RegistrationService {

	private final UserRepository userRepository;
	private final CareGroupRepository careGroupRepository;
	private final PatientRepository patientRepository;
	private final CareGroupUserRepository careGroupUserRepository;
	private final PasswordEncoder passwordEncoder;

	public RegistrationService(UserRepository userRepository, CareGroupRepository careGroupRepository,
			PatientRepository patientRepository, CareGroupUserRepository careGroupUserRepository,
			PasswordEncoder passwordEncoder) {
		super();
		this.userRepository = userRepository;
		this.careGroupRepository = careGroupRepository;
		this.patientRepository = patientRepository;
		this.careGroupUserRepository = careGroupUserRepository;
		this.passwordEncoder = passwordEncoder;
	}

	private void validateEmail(String email) {
		if (userRepository.existsByEmail(email)) {
			throw new EmailAlreadyRegisteredException();
		}
	}

	
	public void register(RegisterRequest request) throws Exception {

		validateEmail(request.email());

		User user = createUser(request);
		
		CareGroup careGroup = createCareGroup(request);
		Patient patient = createPatient(request, careGroup);
		
		createOwnerCareGroupUser(user, careGroup);

	}

	private void createOwnerCareGroupUser(User user, CareGroup careGroup) {
		CareGroupUser careGroupUser = new CareGroupUser();

		careGroupUser.setUser(user);
		careGroupUser.setCareGroup(careGroup);
		careGroupUser.setRole(CareGroupRole.OWNER);
		
		careGroupUserRepository.save(careGroupUser);
	}

	private Patient createPatient(RegisterRequest request, CareGroup careGroup) {
		Patient patient = new Patient();

		patient.setName(request.patientName());
		patient.setBirthDate(request.patientBirthDate());
		patient.setCareGroup(careGroup);
		patientRepository.save(patient);

		return patient;
	}

	private CareGroup createCareGroup(RegisterRequest request) {
		CareGroup group = new CareGroup();

		group.setName(request.careGroupName());
		careGroupRepository.save(group);

		return group;
	}

	private User createUser(RegisterRequest request) {
		User user = new User();

		user.setEmail(request.email());
		user.setName(request.userName());
		user.setPasswordHash(passwordEncoder.encode(request.password()));
		user.setRole(UserRole.USER);

		userRepository.save(user);
		return user;

	}

}