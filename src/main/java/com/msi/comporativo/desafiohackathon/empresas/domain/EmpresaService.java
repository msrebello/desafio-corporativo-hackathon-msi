package com.msi.comporativo.desafiohackathon.empresas.domain;

import com.msi.comporativo.desafiohackathon.empresas.infrastructure.EmpresaRepository;
import com.msi.comporativo.desafiohackathon.funcionarios.domain.Funcionario;
import com.msi.comporativo.desafiohackathon.funcionarios.domain.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmpresaService {

    @Autowired
    EmpresaRepository empresaRepository;
    @Autowired
    FuncionarioService funcionarioService;

    public EmpresaDTO getById(Integer empresaId) {

        Empresa empresaEntity = empresaRepository.getOne(empresaId);
        EmpresaDTO empresa = new EmpresaDTO().fromEntity(empresaEntity);
        List<Funcionario> funcionarios = funcionarioService.getByEmpresaId(empresa.getId());
        empresa.setFuncionarios(funcionarios);
        return empresa;
    }

    public List<EmpresaDTO> getAll() {

        List<EmpresaDTO> empresas = empresaRepository.findAll().stream()
                .map(empresa -> new EmpresaDTO().fromEntity(empresa))
                .collect(Collectors.toList());

        empresas.forEach(empresa -> {
            empresa.setFuncionarios(funcionarioService.getByEmpresaId(empresa.getId()));
        });
        return empresas;
    }
}
