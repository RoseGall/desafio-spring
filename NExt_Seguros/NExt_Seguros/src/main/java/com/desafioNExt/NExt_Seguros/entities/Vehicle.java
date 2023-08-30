package com.desafioNExt.NExt_Seguros.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Vehicle {
    
    @Id
    private long id;
	private String brand;
    private String model;
    private int year;

   }