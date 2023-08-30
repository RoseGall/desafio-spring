package com.desafioNExt.NExt_Seguros.entities;

public class adress {

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
@Table(name = "adresses")
public class Adress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adress_id", nullable = false, updatable = false, unique = true)
    private long id;
    @Column(name = "adress_location", nullable = false)
    private String location;
    @Column(name = "adress_number", nullable = false)
    private int number;
    @Column(name = "adress_zipcode", nullable = false)
    private String zipcode;
    @Column(name = "adress_observation")
    private String observation;

    /*
    @ManyToMany
    @JoinTable(name = "adresses_clients",
               joinColumns = @JoinColumn(name = "adress_fk"),
               inverseJoinColumns = @JoinColumn(name = "client_fk"))
    List<Client> clients;
    */
}
}

