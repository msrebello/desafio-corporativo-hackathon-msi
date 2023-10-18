package com.msi.comporativo.desafiohackathon.funcionarios.application;

import com.msi.comporativo.desafiohackathon.funcionarios.domain.Funcionario;
import com.msi.comporativo.desafiohackathon.funcionarios.infrastructure.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/funcionario")
public class FuncionarioController {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @GetMapping
    public List<Funcionario> getAll() {
        return funcionarioRepository.findAll();
    }

    @PostMapping
    public Funcionario create(@RequestBody Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }
}
