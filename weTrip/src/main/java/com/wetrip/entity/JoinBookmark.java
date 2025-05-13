package com.wetrip.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JoinBookmark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long key;

    @Column(nullable = false)
    private Long key2;

    @Column(nullable = false)
    private Long key3;

    @Column(nullable = false)
    private LocalDateTime bookmarkedAt;

    @Column(nullable = false)
    private Integer bookmarkCount = 0;
}

