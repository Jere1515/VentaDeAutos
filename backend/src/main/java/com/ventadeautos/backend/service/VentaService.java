package com.ventadeautos.backend.service;

import com.ventadeautos.backend.model.Venta;
import com.ventadeautos.backend.repository.VentaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService {

    private final VentaRepository ventaRepository;

    public VentaService(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    // Registrar una venta
    public Venta registrarVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    // Listar todas las ventas
    public List<Venta> listarVentas() {
        return ventaRepository.findAll();
    }
}
