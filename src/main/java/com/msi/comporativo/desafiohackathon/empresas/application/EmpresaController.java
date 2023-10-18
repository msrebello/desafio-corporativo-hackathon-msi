package com.msi.comporativo.desafiohackathon.empresas.application;

import com.msi.comporativo.desafiohackathon.empresas.domain.Empresa;
import com.msi.comporativo.desafiohackathon.empresas.infrastructure.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/empresa")
public class EmpresaController {

    @Autowired
    EmpresaRepository empresaRepository;

    @GetMapping
    public List<Empresa> getAll(){
        return empresaRepository.findAll();
    }

    @PostMapping
    public Empresa create(@RequestBody Empresa empresa){
        return empresaRepository.save(empresa);
    }
}
