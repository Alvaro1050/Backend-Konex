package com.example.controllers;
import com.example.models.Venta;
import com.example.services.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/venta")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @PostMapping("/create")
    public ResponseEntity<Venta> createVenta(@RequestBody Venta venta) {
        ventaService.createVenta(venta);
        return ResponseEntity.ok(venta);
    }

    @GetMapping("/find")
    public ResponseEntity<List<Venta>> findAllVenta() {
        List<Venta> ventas = ventaService.findAllVenta();
        return ResponseEntity.ok(ventas);
    }

    @DeleteMapping("/delete")
    public Boolean DeleteVenta(@RequestParam Long idVenta) {
        Boolean ventas = ventaService.deleteVenta(idVenta);
        return true;
    }

    @PutMapping("/update/{id}")
    public Venta updateVenta(@PathVariable Long id, @RequestBody Venta venta) {
        venta.setId(id);
        return ventaService.updateVenta(venta);
    }
}
