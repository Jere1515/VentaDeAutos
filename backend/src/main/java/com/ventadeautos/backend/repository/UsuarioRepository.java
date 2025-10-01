package com.ventadeautos.backend.repository;

import com.ventadeautos.backend.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Para buscar usuarios por email (útil en login)
    Optional<Usuario> findByEmail(String email);
}
