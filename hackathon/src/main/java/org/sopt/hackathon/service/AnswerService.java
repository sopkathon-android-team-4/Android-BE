package org.sopt.hackathon.service;

import lombok.RequiredArgsConstructor;
import org.sopt.hackathon.common.dto.ErrorMessage;
import org.sopt.hackathon.domain.Answer;
import org.sopt.hackathon.dto.response.AnswerResponseDto;
import org.sopt.hackathon.exception.CustomizedException;
import org.sopt.hackathon.repository.AnswerRepository;
import org.sopt.hackathon.repository.ConcernRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AnswerService {
    private final AnswerRepository answerRepository;
    private final ConcernRepository concernRepository;


    public AnswerResponseDto getAnswerById(Long concernId) {
        // 걱정 ID로 답변 제공
        Optional<Answer> optionalAnswer = answerRepository.findById(concernId);
        if (optionalAnswer.isPresent()) {
            Answer answer = optionalAnswer.get();
            return new AnswerResponseDto(answer.getContent());
        } else {
            throw new CustomizedException(ErrorMessage.CONCERN_NOT_FOUND_BY_ID_EXCEPTION);
        }
    }
    public List<Answer> findAnswersByConcernCount(Long memberId) {
        long count = concernRepository.countByMemberId(memberId);  // 멤버 ID에 따른 Concern의 총 개수를 가져옴
        List<Answer> answers = answerRepository.findByIdBetween(1L, count);  // 1부터 Concern 개수만큼의 Answer 조회
        return  answers;
    }


}
