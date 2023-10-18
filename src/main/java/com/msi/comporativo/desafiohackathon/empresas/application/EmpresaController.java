package com.msi.comporativo.desafiohackathon.empresas.application;

import com.msi.comporativo.desafiohackathon.empresas.domain.Empresa;
import com.msi.comporativo.desafiohackathon.empresas.infrastructure.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
