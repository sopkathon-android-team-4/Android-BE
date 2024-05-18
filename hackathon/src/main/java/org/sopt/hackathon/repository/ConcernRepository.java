package org.sopt.hackathon.repository;

import org.sopt.hackathon.domain.Concern;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcernRepository extends JpaRepository<Concern, Long> {
}
