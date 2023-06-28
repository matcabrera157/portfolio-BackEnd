package com.portfolioBackEnd.backend.Service;

import com.portfolioBackEnd.backend.Entity.Persona;
import com.portfolioBackEnd.backend.Interface.IPersonaService;
import com.portfolioBackEnd.backend.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService {
    @Autowired IPersonaRepository ipersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonaRepository.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        ipersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        ipersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = ipersonaRepository.findById(id).orElse(null);
        return persona;
    }
    


    @Override
    public Persona updatePersona(Long id, Persona persona) {
        Persona updatedPersona  = ipersonaRepository.findById(id).orElse(null);
        updatedPersona.setNombre(persona.getNombre());
        updatedPersona.setApellido(persona.getApellido());
        updatedPersona.setImg(persona.getImg());
        
        ipersonaRepository.save(updatedPersona);
        return updatedPersona;
    }
    
}