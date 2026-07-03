package com.kminfo.vida_compartilhada.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kminfo.vida_compartilhada.entities.CareGroup;
import com.kminfo.vida_compartilhada.entities.CareGroupUser;

@Repository
public interface CareGroupRepository extends JpaRepository<CareGroup, Long>{

	 Optional<CareGroupUser>
	    findByCareGroupIdAndUserId(
	            Long careGroupId,
	            Long userId
	    );

	    List<CareGroupUser>
	    findByCareGroupId(Long careGroupId);

	    List<CareGroupUser>
	    findByUserId(Long userId);
	
}
