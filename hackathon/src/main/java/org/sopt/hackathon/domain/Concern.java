package org.sopt.hackathon.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


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

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    @Builder
    public Concern(String content, Member member) {
        this.content = content;
        this.member = member;
    }
}
