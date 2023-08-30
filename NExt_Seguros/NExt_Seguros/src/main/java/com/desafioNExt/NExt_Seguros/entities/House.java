package com.desafioNExt.NExt_Seguros.entities;

import com.desafioNExt.NExt_Seguros.enums.OwnershipStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor 
@AllArgsConstructor
@Entity
@Table(name = "houses")
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false, unique = true)
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "ownership_status", nullable = false)
    private OwnershipStatus ownership_status;

    @Column(name = "location", nullable = false)
    private String location;
    
    @Column(name = "zipcode", nullable = false)
    private String zipcode;

    @ManyToOne
    @JoinColumn(name = "id", nullable = true)
    private Client client;
}

