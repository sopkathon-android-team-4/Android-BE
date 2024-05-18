package org.sopt.hackathon.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum SuccessMessage {

    POST_SUCCESS(HttpStatus.CREATED.value(), "등록이 완료되었습니다."),
    LUCKY_ANSWER_SUCCESS(HttpStatus.OK.value(), "럭키럭키 체인지가 성공하다니 완전 럭키비키잖앙🍀"),
     ;
    private final int status;
    private final String message;

}
