package org.sopt.hackathon.exception;


import org.sopt.hackathon.common.dto.ErrorMessage;

public class CustomizedException extends BusinessException {

    public CustomizedException(ErrorMessage errorMessage) {
        super(errorMessage);
    }
}
