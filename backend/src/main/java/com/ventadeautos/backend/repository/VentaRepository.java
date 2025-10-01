package com.ventadeautos.backend.repository;

import com.ventadeautos.backend.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {
    // Aquí puedes añadir consultas personalizadas si lo necesitas
}
