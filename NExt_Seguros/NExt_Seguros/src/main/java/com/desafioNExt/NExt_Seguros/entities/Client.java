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
public class Client {
    @Id
    private long id;
	private String name;
    private int age;
    private int dependents;
    private double income;
    private String marital_status;
    private long houses ;
    private long vehicles ;
    private String createdAt ;
    private String updatedAt ;
}
