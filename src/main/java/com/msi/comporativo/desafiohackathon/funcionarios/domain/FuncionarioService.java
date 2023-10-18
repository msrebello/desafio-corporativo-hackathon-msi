package com.msi.comporativo.desafiohackathon.funcionarios.domain;

import com.msi.comporativo.desafiohackathon.funcionarios.infrastructure.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FuncionarioService {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    public List<Funcionario> getByEmpresaId(Integer empresaId) {
        return funcionarioRepository.findByEmpresaId(empresaId);
    }
}
