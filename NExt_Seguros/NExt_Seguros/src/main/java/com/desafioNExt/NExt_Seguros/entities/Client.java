package com.desafioNExt.NExt_Seguros.entities;


import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id", nullable = false, updatable = false, unique = true)
    private long id;
    @Column(name = "client_name", nullable = false)
    private String name;
    @Column(name = "client_age", nullable = false)
    private int age;
    @Column(name = "client_dependents", nullable = false)
    private int dependents;
    @Column(name = "client_income", nullable = false)
    private double income;
    @Enumerated(EnumType.STRING)
    @Column(name = "client_marital_status")
    private Marital_Status marital_status;
    private Date createdAt;
    private Date updatedAt;

    @OneToMany(mappedBy =  "client")
    private List<Vehicle> vehicles;

    @OneToMany(mappedBy = "client")
    private List<House> houses;

    // @ManyToMany(mappedBy = "clients")
    // private List<Adress> adresses;
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
//public class Client {
//    @Id
 //   private long id;
//	private String name;
 //   private int age;
 //   private int dependents;
 //   private double income;
 //   private String marital_status;
    // mudar para tipos especificos e adicionar o relacionamento (many to one, one to many...)
 //   private long houses ;
 //   private long vehicles ;
    // mudar para tipo data
 //   private String createdAt ;
  //  private String updatedAt ;
//}
