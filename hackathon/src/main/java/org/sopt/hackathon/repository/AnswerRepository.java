package org.sopt.hackathon.repository;

import org.sopt.hackathon.domain.Answer;
import org.sopt.hackathon.domain.Concern;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
    Optional<Answer> findById(Long id);
    List<Answer> findByIdBetween(Long startId, Long endId);


}
