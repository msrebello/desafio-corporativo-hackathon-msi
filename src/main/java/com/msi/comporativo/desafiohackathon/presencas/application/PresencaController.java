package com.msi.comporativo.desafiohackathon.presencas.application;

import com.msi.comporativo.desafiohackathon.presencas.domain.Presenca;
import com.msi.comporativo.desafiohackathon.presencas.domain.PresencaDTO;
import com.msi.comporativo.desafiohackathon.presencas.domain.PresencaService;
import com.msi.comporativo.desafiohackathon.presencas.infrastructure.PresencaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/v1/presencas")
public class PresencaController {

    @Autowired
    PresencaRepository presencaRepository;

    @Autowired
    PresencaService presencaService;

    @GetMapping
    public List<Presenca> getAll() {
        return presencaService.getAll();
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestBody PresencaDTO presencaDTO) {
        return presencaService.save(presencaDTO);
    }

    @GetMapping(path = "/obra/{obraId}/{dataPresenca}")
    public Set<String> getByObraIdAndDataPresenca(@PathVariable Integer obraId, @PathVariable String dataPresenca) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return presencaService.getByObraIdAndDataPresenca(obraId, LocalDate.parse(dataPresenca, formatter));
    }
}
