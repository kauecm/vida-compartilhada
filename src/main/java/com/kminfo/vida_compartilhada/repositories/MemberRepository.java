package com.kminfo.vida_compartilhada.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kminfo.vida_compartilhada.entities.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
