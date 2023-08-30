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

public class House {
    
    @Id
    private long id;
	private String ownership_status;
    private String location;
     private String zipcode ;
    //  adicionar o relacionamento (many to one, one to many...)
  
}
