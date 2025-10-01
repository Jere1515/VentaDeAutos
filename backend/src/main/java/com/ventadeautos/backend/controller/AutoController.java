package com.ventadeautos.backend.controller;

import com.ventadeautos.backend.model.Auto;
import com.ventadeautos.backend.service.AutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/autos")
@CrossOrigin(origins = "*") // Permite llamadas desde el frontend (Angular)
public class AutoController {

    private final AutoService autoService;

    public AutoController(AutoService autoService) {
        this.autoService = autoService;
    }

    // GET: Listar todos los autos
    @GetMapping
    public List<Auto> listarAutos() {
        return autoService.listarAutos();
    }

    // GET: Obtener auto por ID
    @GetMapping("/{id}")
    public ResponseEntity<Auto> obtenerAutoPorId(@PathVariable Long id) {
        Optional<Auto> auto = autoService.obtenerAutoPorId(id);
        return auto.map(ResponseEntity::ok)
                   .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // POST: Registrar nuevo auto
    @PostMapping
    public Auto guardarAuto(@RequestBody Auto auto) {
        return autoService.guardarAuto(auto);
    }

    // PUT: Actualizar auto
    @PutMapping("/{id}")
    public ResponseEntity<Auto> actualizarAuto(@PathVariable Long id, @RequestBody Auto autoDetalles) {
        return autoService.obtenerAutoPorId(id)
                .map(autoExistente -> {
                    autoExistente.setMarca(autoDetalles.getMarca());
                    autoExistente.setModelo(autoDetalles.getModelo());
                    autoExistente.setAnio(autoDetalles.getAnio());
                    autoExistente.setPrecio(autoDetalles.getPrecio());
                    Auto actualizado = autoService.guardarAuto(autoExistente);
                    return ResponseEntity.ok(actualizado);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // DELETE: Eliminar auto
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarAuto(@PathVariable Long id) {
        autoService.eliminarAuto(id);
        return ResponseEntity.noContent().build();
    }
}
