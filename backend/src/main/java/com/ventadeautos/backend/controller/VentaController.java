package com.ventadeautos.backend.controller;

import com.ventadeautos.backend.model.Venta;
import com.ventadeautos.backend.service.VentaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ventas")
@CrossOrigin(origins = "*") // Permite conexión desde Angular
public class VentaController {

    private final VentaService ventaService;

    public VentaController(VentaService ventaService) {
        this.ventaService = ventaService;
    }

    // POST: Registrar venta
    @PostMapping
    public Venta registrarVenta(@RequestBody Venta venta) {
        return ventaService.registrarVenta(venta);
    }

    // GET: Listar ventas
    @GetMapping
    public List<Venta> listarVentas() {
        return ventaService.listarVentas();
    }

    // GET: Obtener venta por ID
    @GetMapping("/{id}")
    public ResponseEntity<Venta> obtenerVentaPorId(@PathVariable Long id) {
        return ventaService.listarVentas().stream()
                .filter(v -> v.getId().equals(id))
                .findFirst()
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
