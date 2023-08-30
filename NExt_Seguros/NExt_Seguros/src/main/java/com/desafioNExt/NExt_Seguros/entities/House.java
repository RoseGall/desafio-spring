package com.desafioNExt.NExt_Seguros.entities;

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
    @Column(name = "house_id", nullable = false, updatable = false, unique = true)
    private long id;
    @Enumerated(EnumType.STRING)
    @Column(name = "house_ownership_status", nullable = false)
    private Ownership_Status ownership_status;
    @Column(name = "house_location", nullable = false)
    private String location;
    @Column(name = "house_zipcode", nullable = false)
    private String zipcode;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = true)
    private Client client;
}


//******************************************
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

//public class House {
    
 //   @Id
 //   private long id;
//	private String ownership_status;
 //   private String location;
 //    private String zipcode ;
    //  adicionar o relacionamento (many to one, one to many...)
  
//}
