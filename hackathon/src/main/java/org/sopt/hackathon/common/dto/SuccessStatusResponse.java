package org.sopt.hackathon.common.dto;

public record SuccessStatusResponse(
        int status,
        String message,
        Object data
) {

    public static SuccessStatusResponse of(int status, String message, Object data) {
        return new SuccessStatusResponse(status, message, data);
    }
}
