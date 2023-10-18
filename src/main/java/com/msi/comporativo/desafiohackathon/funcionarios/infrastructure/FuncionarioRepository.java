package com.msi.comporativo.desafiohackathon.funcionarios.infrastructure;

import com.msi.comporativo.desafiohackathon.funcionarios.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository <Funcionario, Integer> {
}
