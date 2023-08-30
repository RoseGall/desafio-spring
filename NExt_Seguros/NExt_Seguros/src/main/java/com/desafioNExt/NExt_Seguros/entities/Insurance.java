package com.desafioNExt.NExt_Seguros.entities;

import java.util.Date;

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
@Table(name = "insurances")

public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "insurance_id", nullable = false, updatable = false, unique = true)
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "insurance_type")
    private Insurance_Type insurance_type;
    @Enumerated(EnumType.STRING)
    @Column(name = "insurance_analysis")
    private Insurance_Type insurance_analysis;
    
    @Column(name = "insurance_observation", nullable = true)
    private String observation;
	private Date createdAt;
	private Date validatedAt;

}
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;

//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@Entity

//public class Insurance {
    
//    @Id
//    private long id;
//	private String type;
 //   private int risk;
 //   private String analysis;
 //   private String observation;
    
    // mudar para tipos especificos e adicionar o relacionamento (many to one, one to many...)
 //   private String createdAt ;
 //  private String updatedAt ;

    
//}
