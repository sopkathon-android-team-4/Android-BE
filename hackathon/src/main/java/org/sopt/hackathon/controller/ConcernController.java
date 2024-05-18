package org.sopt.hackathon.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.sopt.hackathon.common.dto.SuccessMessage;
import org.sopt.hackathon.common.dto.SuccessStatusResponse;
import org.sopt.hackathon.dto.ConcernCreateDto;
import org.sopt.hackathon.service.ConcernService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/concerns")
public class ConcernController {

    private final ConcernService concernService;

    @Operation(summary = "걱정 생성", description = """
            걱정 등록에 성공하면
            "201 Created 걱정 생성이 럭키쌈뽕하게 완료되었습니다." 반환 \n
            concernId 반환
            """)
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public SuccessStatusResponse createConcern(
            @RequestHeader(value = "memberId") Long memberId,
            @RequestBody ConcernCreateDto concernCreateDto
    ) {
        return SuccessStatusResponse.of(SuccessMessage.CONCERN_CREATE_SUCCESS.getStatus(),
                SuccessMessage.CONCERN_CREATE_SUCCESS.getMessage(),
                concernService.createConcern(memberId, concernCreateDto));
    }

}
