
package com.portfolioBackEnd.backend.Security.Repository;

import com.portfolioBackEnd.backend.Security.Entity.Rol;
import com.portfolioBackEnd.backend.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol>findByRolNombre(RolNombre rolnombre);
}
