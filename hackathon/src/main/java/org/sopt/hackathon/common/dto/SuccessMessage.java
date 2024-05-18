package org.sopt.hackathon.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum SuccessMessage {

    POST_SUCCESS(HttpStatus.CREATED.value(), "등록이 완료되었습니다."),
    MEMBER_CREATE_SUCCESS(HttpStatus.CREATED.value(), "멤버 생성이 럭키쌈뽕하게 완료되었습니다."),

    ;
    private final int status;
    private final String message;

}
