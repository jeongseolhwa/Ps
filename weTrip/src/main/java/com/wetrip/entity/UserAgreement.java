package com.wetrip.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserAgreement {

    @Id
    @Column(nullable = false)
    private Long key2;

    @Column(nullable = false)
    private Boolean genderConsentProvided = false;

    @Column(nullable = false)
    private Boolean birthdayConsentProvided = false;

    @Column(nullable = false)
    private Boolean contactConsentProvided = false;

    @Column(nullable = false)
    private Boolean ageConsentProvided = false;

    @Column(nullable = false)
    private Boolean emailConsentProvided = false;
}

