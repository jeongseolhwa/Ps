package com.wetrip.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "reviews")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer key;

    @Column(nullable = false)
    private Long key2;

    @Column(nullable = false)
    private Long key3;

    @Column(columnDefinition = "TEXT")
    private String content;

    private Byte rating;

    private LocalDateTime reviewDate;
}

