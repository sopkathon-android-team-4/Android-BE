package org.sopt.hackathon.service;

import lombok.RequiredArgsConstructor;
import org.sopt.hackathon.domain.Member;
import org.sopt.hackathon.dto.MemberCreateDto;
import org.sopt.hackathon.dto.MemberPostResponseDto;
import org.sopt.hackathon.repository.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public MemberPostResponseDto createMember(
            MemberCreateDto memberCreateDto
    ) {
        Member member = memberRepository.save(
                Member.create(memberCreateDto.name(), memberCreateDto.age(), memberCreateDto.mbti()));
        return MemberPostResponseDto.of(member);
    }
}
