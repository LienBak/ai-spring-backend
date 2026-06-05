package com.sesac.aibackend.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

/**
 * 채팅 로그.
 *
 * Day 5에서 FastAPI 호출 결과를 저장합니다.
 * User와 단방향 ManyToOne — 운영 단순화를 위해 양방향은 피합니다.
 */
@Entity
@Table(name = "chat_logs") // chat_logs와 매핑이 되겠군
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class ChatLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)              // 연관관계 주인, 하나의 부모를 참조하겠군
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String prompt;

    @Column(columnDefinition = "TEXT")
    private String response;

    @CreationTimestamp          // 생성시간
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

}