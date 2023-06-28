
package com.portfolioBackEnd.backend.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank(message = "The NAME is required")
    @Size(min = 1, max = 50, message ="no cumple con la longitud")
    private String nombre;
        
    @NotBlank(message = "The NAME is required")
    @Size(min = 1, max = 50, message ="no cumple con la longitud")
    private String apellido;
    
    @NotBlank(message = "The NAME is required")
    @Size(min = 1, max = 50, message ="no cumple con la longitud")
    private String img;

       
}
