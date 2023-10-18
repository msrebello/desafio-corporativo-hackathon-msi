package com.msi.comporativo.desafiohackathon.empresas.infrastructure;

import com.msi.comporativo.desafiohackathon.empresas.domain.Funcionario;
import com.msi.comporativo.desafiohackathon.empresas.domain.Obra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObraRepository extends JpaRepository <Obra, Integer> {
}
