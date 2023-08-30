package com.desafioNExt.NExt_Seguros.entities;

import java.util.Date;

import com.desafioNExt.NExt_Seguros.enums.InsuranceAnalysis;
import com.desafioNExt.NExt_Seguros.enums.InsuranceType;

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
@Table(name = "insurance")

public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false, unique = true)
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private InsuranceType type;
    @Enumerated(EnumType.STRING)
    @Column(name = "analysis")
    private InsuranceAnalysis analysis;
    
    @Column(name = "observation", nullable = true)
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
