package org.sopt.hackathon.dto;

import org.sopt.hackathon.domain.Member;

public record MemberFindDto(
        String name
) {

    public static MemberFindDto of(
            Member member
    ) {
        return new MemberFindDto(member.getMemberName());
    }
}
