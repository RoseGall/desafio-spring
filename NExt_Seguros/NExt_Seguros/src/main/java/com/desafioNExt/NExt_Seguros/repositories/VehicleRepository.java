package com.desafioNExt.NExt_Seguros.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafioNExt.NExt_Seguros.entities.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    
}
