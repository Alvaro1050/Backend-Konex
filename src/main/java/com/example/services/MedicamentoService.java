package com.example.services;

import com.example.models.Medicamento;
import com.example.repositories.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentoService {

    @Autowired
    private MedicamentoRepository medicamentoRepository;

    public Medicamento createMedicamento(Medicamento medicamento) {
        return medicamentoRepository.save(medicamento);
    }

    public List<Medicamento> findAllMedicamento() {
        return medicamentoRepository.findAll();
    }

    public Boolean deleteMedicamento(Long id) {
        medicamentoRepository.deleteById(id);
        return true;
    }

    public Medicamento updateMedicamento(Medicamento medicamento) {
        return medicamentoRepository.save(medicamento);
    }
}
