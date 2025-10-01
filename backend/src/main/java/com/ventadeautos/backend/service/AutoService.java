package com.ventadeautos.backend.service;

import com.ventadeautos.backend.model.Auto;
import com.ventadeautos.backend.repository.AutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutoService {

    private final AutoRepository autoRepository;

    // Inyección de dependencias por constructor
    public AutoService(AutoRepository autoRepository) {
        this.autoRepository = autoRepository;
    }

    // Listar todos los autos
    public List<Auto> listarAutos() {
        return autoRepository.findAll();
    }

    // Buscar un auto por ID
    public Optional<Auto> obtenerAutoPorId(Long id) {
        return autoRepository.findById(id);
    }

    // Guardar o actualizar un auto
    public Auto guardarAuto(Auto auto) {
        return autoRepository.save(auto);
    }

    // Eliminar un auto por ID
    public void eliminarAuto(Long id) {
        autoRepository.deleteById(id);
    }
}
