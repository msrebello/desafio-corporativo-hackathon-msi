package com.msi.comporativo.desafiohackathon.empresas.application;

import com.msi.comporativo.desafiohackathon.empresas.domain.Empresa;
import com.msi.comporativo.desafiohackathon.empresas.domain.EmpresaDTO;
import com.msi.comporativo.desafiohackathon.empresas.domain.EmpresaService;
import com.msi.comporativo.desafiohackathon.empresas.infrastructure.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("/api/v1/empresa")
public class EmpresaController {

    @Autowired
    EmpresaRepository empresaRepository;
    @Autowired
    EmpresaService empresaService;

    @GetMapping
    public List<EmpresaDTO> getAll() {
        return empresaService.getAll();
    }

    @GetMapping(path = "/getByEmpresaId")
    public List<EmpresaDTO> getEmpresaId(Integer empresaId) {
        return List.of(empresaService.getById(empresaId));
    }

    @PostMapping
    public Empresa create(@RequestBody Empresa empresa) {
        return empresaRepository.save(empresa);
    }
}
