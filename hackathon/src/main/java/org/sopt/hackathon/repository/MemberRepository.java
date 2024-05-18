package org.sopt.hackathon.repository;

import org.sopt.hackathon.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
