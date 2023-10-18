package com.msi.comporativo.desafiohackathon.funcionarios.infrastructure;

import com.msi.comporativo.desafiohackathon.funcionarios.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

    List<Funcionario> findByEmpresaId(Integer empresaId);
}
