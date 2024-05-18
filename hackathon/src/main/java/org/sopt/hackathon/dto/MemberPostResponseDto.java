package org.sopt.hackathon.dto;

import org.sopt.hackathon.domain.Member;

public record MemberPostResponseDto(Long memberId
) {
    public static MemberPostResponseDto of(
            Member member
    ) {
        return new MemberPostResponseDto(member.getId());
    }
}
