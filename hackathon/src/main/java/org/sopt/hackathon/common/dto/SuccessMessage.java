package org.sopt.hackathon.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum SuccessMessage {

    POST_SUCCESS(HttpStatus.CREATED.value(), "등록이 완료되었습니다."),
    MEMBER_CREATE_SUCCESS(HttpStatus.CREATED.value(), "멤버 생성이 럭키쌈뽕하게 완료되었습니다."),
    LUCKY_ANSWER_SUCCESS(HttpStatus.OK.value(), "럭키럭키 체인지가 성공하다니 완전 럭키비키잖앙🍀"),
    LUCKY_ANSWER_LIST_SUCCESS(HttpStatus.OK.value(), "럭키럭키 체인지가 리스트 반환에 성공하다니 완전 럭키비키잖앙🍀"),
    MEMBER_FIND_SUCCESS(HttpStatus.OK.value(), "멤버 조회가 럭키쌈뽕하게 성공했습니다."),
    CONCERN_CREATE_SUCCESS(HttpStatus.CREATED.value(), "걱정 생성이 럭키쌈뽕하게 완료되었습니다."),
    ;

    private final int status;
    private final String message;

}
