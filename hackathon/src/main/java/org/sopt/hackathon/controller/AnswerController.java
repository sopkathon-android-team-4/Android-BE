package org.sopt.hackathon.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.sopt.hackathon.common.dto.SuccessMessage;
import org.sopt.hackathon.common.dto.SuccessStatusResponse;
import org.sopt.hackathon.domain.Answer;
import org.sopt.hackathon.dto.response.AnswerResponseDto;
import org.sopt.hackathon.service.AnswerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class AnswerController {

    private final AnswerService answerService;

    @Operation(summary = "럭키비키 답변 제공", description = """
            럭키비키 답변을 제공하는 api입니다.
            RequestHeader로 concernId를 받아와서 해당 id에 맞는 럭키비키 답변을 제공합니다.
            럭키비키 답변을 제공 받다니 완전 럭키비키잖앙 🍀
            성공시 200 ok 반환 ~
            """)
    @GetMapping("/answers")
    public ResponseEntity<SuccessStatusResponse> getAnswerById(@RequestHeader Long concernId) {
        AnswerResponseDto answerResponseDto = answerService.getAnswerById(concernId);
        return ResponseEntity.ok(SuccessStatusResponse.of(
                SuccessMessage.LUCKY_ANSWER_SUCCESS.getStatus(),
                SuccessMessage.LUCKY_ANSWER_SUCCESS.getMessage(),
                answerResponseDto
        ));
    }

    @GetMapping("/answers/{memberId}/list")
    public ResponseEntity<SuccessStatusResponse> getAnswerList(@PathVariable Long memberId) {
        List<Answer> answers = answerService.findAnswersByConcernCount(memberId);
        List<AnswerResponseDto> answerResponseDtoList = answers.stream()
                .map(answer -> new AnswerResponseDto(answer.getContent())) // getContent()는 예시
                .collect(Collectors.toList());
        return ResponseEntity.ok(SuccessStatusResponse.of(
                SuccessMessage.LUCKY_ANSWER_SUCCESS.getStatus(),
                SuccessMessage.LUCKY_ANSWER_SUCCESS.getMessage(),
                answerResponseDtoList
        ));
    }

}
