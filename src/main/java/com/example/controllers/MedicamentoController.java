package com.example.controllers;
import com.example.models.Medicamento;
import com.example.services.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Controller
@CrossOrigin(origins = "*")
@RequestMapping("/medicamento")
public class MedicamentoController {

    @Autowired
    private MedicamentoService medicamentoService;

    @PostMapping("/create")
    public ResponseEntity<Medicamento> createMedicamento(@RequestBody Medicamento medicamento) {
        medicamentoService.createMedicamento(medicamento);
        return ResponseEntity.ok(medicamento);
    }

    @GetMapping("/find/{id}")
    @CrossOrigin(origins = "*")
    public ResponseEntity<Optional<Medicamento>> findMedicamentoById(@PathVariable Long id) {
        Optional<Medicamento> medicamento = medicamentoService.findMedicamentoById(id);
        return ResponseEntity.ok(medicamento);
    }

    @GetMapping("/find")
    @CrossOrigin(origins = "*")
    public ResponseEntity<List<Medicamento>> findAllMedicamento() {
        List<Medicamento> medicamentos = medicamentoService.findAllMedicamento();
        return ResponseEntity.ok(medicamentos);
    }

    @DeleteMapping("/delete")
    public Boolean DeleteMedicamento(@RequestParam Long idMedicamento) {
        Boolean medicamentos = medicamentoService.deleteMedicamento(idMedicamento);
        return true;
    }

    @PutMapping("/update/{id}")
    public Medicamento updateMedicamento(@PathVariable Long id, @RequestBody Medicamento medicamento) {
        medicamento.setId(id);
        return medicamentoService.updateMedicamento(medicamento);
    }
}
