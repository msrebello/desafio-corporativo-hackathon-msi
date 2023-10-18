package com.msi.comporativo.desafiohackathon.empresas.application;

import com.msi.comporativo.desafiohackathon.empresas.domain.Empresa;
import com.msi.comporativo.desafiohackathon.empresas.domain.Funcionario;
import com.msi.comporativo.desafiohackathon.empresas.infrastructure.EmpresaRepository;
import com.msi.comporativo.desafiohackathon.empresas.infrastructure.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/funcionario")
public class FuncionarioController {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @GetMapping
    public List<Funcionario> getAll(){
        return funcionarioRepository.findAll();
    }
}
