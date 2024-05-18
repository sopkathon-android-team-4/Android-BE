package org.sopt.hackathon.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.sopt.hackathon.common.dto.SuccessMessage;
import org.sopt.hackathon.common.dto.SuccessStatusResponse;
import org.sopt.hackathon.dto.MemberCreateDto;
import org.sopt.hackathon.service.MemberService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/members")
public class MemberController {

    private final MemberService memberService;

    @Operation(summary = "멤버 생성", description = """
            멤버 등록에 성공하면
            "201 Created 멤버 생성이 럭키쌈뽕하게 완료되었습니다." 반환\n
            memberId 반환
            """)
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public SuccessStatusResponse createMember(
            @RequestBody MemberCreateDto memberCreateDto
    ) {
        return SuccessStatusResponse.of(SuccessMessage.MEMBER_CREATE_SUCCESS.getStatus(),
                SuccessMessage.MEMBER_CREATE_SUCCESS.getMessage(), memberService.createMember(memberCreateDto));
    }

    @Operation(summary = "멤버 조회", description = """
            멤버 조회 성공하면
            "200 멤버 조회가 럭키쌈뽕하게 성공했습니다.." 반환\n
            name 반환
            """)
    @GetMapping
    public SuccessStatusResponse getMember(
            @RequestHeader(value = "memberId") Long memberId
    ) {

        return SuccessStatusResponse.of(SuccessMessage.MEMBER_FIND_SUCCESS.getStatus(),
                SuccessMessage.MEMBER_FIND_SUCCESS.getMessage(),
                memberService.findMemberById(memberId));
    }
}
