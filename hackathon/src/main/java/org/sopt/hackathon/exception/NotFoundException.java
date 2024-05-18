package org.sopt.hackathon.exception;


import org.sopt.hackathon.common.dto.ErrorMessage;

public class NotFoundException extends BusinessException {

    public NotFoundException(ErrorMessage errorMessage) {
        super(errorMessage);
    }
}
