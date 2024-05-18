package org.sopt.hackathon.service;

import lombok.RequiredArgsConstructor;
import org.sopt.hackathon.domain.Concern;
import org.sopt.hackathon.dto.ConcernCreateDto;
import org.sopt.hackathon.dto.ConcernPostResponseDto;
import org.sopt.hackathon.repository.ConcernRepository;
import org.sopt.hackathon.repository.MemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ConcernService {

    private final ConcernRepository concernRepository;
    private final MemberRepository memberRepository;

    @Transactional
    public ConcernPostResponseDto createConcern(
            Long memberId,
            ConcernCreateDto concernCreateDto
    ) {

        Concern concern = Concern.builder()
                .content(concernCreateDto.content())
                .member(memberRepository.findById(memberId).get())
                .build();

        return ConcernPostResponseDto.of(concernRepository.save(concern));
    }
}
