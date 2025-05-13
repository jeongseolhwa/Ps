package com.wetrip.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "join_comment")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JoinComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long key;

    @Column(nullable = false)
    private Long postId;

    @Column(nullable = false)
    private Long authorId;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private LocalDateTime commentTime;

    private LocalDateTime updatedTime;
}