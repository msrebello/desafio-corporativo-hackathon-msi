package com.msi.comporativo.desafiohackathon.presencas.infrastructure;

import com.msi.comporativo.desafiohackathon.presencas.domain.Presenca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface PresencaRepository extends JpaRepository<Presenca, Integer> {

    List<Presenca> findByObraIdAndDataPresenca(Integer obraId, LocalDate dataPresenca);

    Optional<Presenca> findByObraIdAndDataPresencaAndFuncionarioId(Integer obraId, LocalDate dataPresenca, Integer funcionarioId);
}
