
package com.portfolioBackEnd.backend.Interface;

import com.portfolioBackEnd.backend.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);    
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona
    public Persona findPersona(Long id);
    
    public Persona updatePersona (Long id, Persona updatedPersona );
    
    
}
