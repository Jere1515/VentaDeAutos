package com.ventadeautos.backend.repository;

import com.ventadeautos.backend.model.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Long> {
    // Aquí puedes definir consultas personalizadas si lo necesitas
    // Ejemplo: List<Auto> findByMarca(String marca);
}
