package org.sopt.hackathon.service;

import lombok.RequiredArgsConstructor;
import org.sopt.hackathon.common.dto.ErrorMessage;
import org.sopt.hackathon.domain.Answer;
import org.sopt.hackathon.dto.AnswerResponse;
import org.sopt.hackathon.exception.CustomizedException;
import org.sopt.hackathon.repository.AnswerRepository;
import org.sopt.hackathon.repository.ConcernRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AnswerService {
    private final AnswerRepository answerRepository;


    public AnswerResponse getAnswerById(Long concernId) {
        // 걱정 ID로 답변 제공
        Optional<Answer> optionalAnswer = answerRepository.findById(concernId);
        if (optionalAnswer.isPresent()) {
            Answer answer = optionalAnswer.get();
            return new AnswerResponse(answer.getContent());
        } else {
            throw new CustomizedException(ErrorMessage.CONCERN_NOT_FOUND_BY_ID_EXCEPTION);
        }
    }



}
