package org.sopt.hackathon.repository;

import org.sopt.hackathon.domain.Concern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ConcernRepository extends JpaRepository<Concern, Long> {
    // 멤버 ID에 따른 Concern의 개수를 반환하는 메소드
    @Query("SELECT COUNT(c) FROM Concern c WHERE c.member.id = :memberId")
    long countByMemberId(Long memberId);
}
