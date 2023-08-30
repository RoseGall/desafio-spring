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

public class Insurance {
    
    @Id
    private long id;
	private String type;
    private int risk;
    private String analysis;
    private String observation;
    
    // mudar para tipos especificos e adicionar o relacionamento (many to one, one to many...)
    private String createdAt ;
    private String updatedAt ;

    
}
