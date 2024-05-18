package org.sopt.hackathon.domain;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.lang.reflect.Member;

@Entity
@NoArgsConstructor
@Getter
public class Concern {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "concern_id")
    private Long id;

    @Column(name = "content", nullable = false)
    private String content;

    @ManyToOne(fetch =FetchType.LAZY)
    private Member member;

    @Builder
    public Concern(String content, Member member){
        this.content = content;
        this.member = member;
    }
}
