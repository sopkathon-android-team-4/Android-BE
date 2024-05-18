package org.sopt.hackathon.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.sopt.hackathon.common.dto.SuccessMessage;
import org.sopt.hackathon.common.dto.SuccessStatusResponse;
import org.sopt.hackathon.dto.AnswerResponse;
import org.sopt.hackathon.service.AnswerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
        AnswerResponse answerResponse = answerService.getAnswerById(concernId);
        return ResponseEntity.ok(SuccessStatusResponse.of(
                SuccessMessage.LUCKY_ANSWER_SUCCESS.getStatus(),
                SuccessMessage.LUCKY_ANSWER_SUCCESS.getMessage(),
                answerResponse
        ));
    }
}
