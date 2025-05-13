package com.wetrip.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "join_apply")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JoinApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long key;

    @Column(nullable = false)
    private Long key2;

    @Column(nullable = false)
    private Long key3;

    private String message;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ApplicationStatus status;

    @Column(nullable = false)
    private LocalDateTime applicationTime;

    public enum ApplicationStatus {
        WAITING, ACCEPTED, REJECTED
    }
}

