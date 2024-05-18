package org.sopt.hackathon.dto;

import org.sopt.hackathon.domain.Concern;

public record ConcernPostResponseDto(Long concernId) {

    public static ConcernPostResponseDto of(Concern concern) {

        return new ConcernPostResponseDto(concern.getId());
    }
    
}
