package com.example.services;

import com.example.models.Venta;
import com.example.repositories.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    public Venta createVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    public List<Venta> findAllVenta() {
        return ventaRepository.findAll();
    }
    public Optional<Venta> findVentaById(Long id) {
        return ventaRepository.findById(id);
    }
    public Boolean deleteVenta(Long id) {
        ventaRepository.deleteById(id);
        return true;
    }

    public Venta updateVenta(Venta venta) {
        return ventaRepository.save(venta);
    }
}
