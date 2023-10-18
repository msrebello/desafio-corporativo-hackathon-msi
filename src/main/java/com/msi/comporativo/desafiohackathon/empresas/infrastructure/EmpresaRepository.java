package com.msi.comporativo.desafiohackathon.empresas.infrastructure;

import com.msi.comporativo.desafiohackathon.empresas.domain.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EmpresaRepository extends JpaRepository <Empresa, Integer> {
}
