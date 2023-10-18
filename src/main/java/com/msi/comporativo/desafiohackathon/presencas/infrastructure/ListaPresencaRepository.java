package com.msi.comporativo.desafiohackathon.presencas.infrastructure;
import com.msi.comporativo.desafiohackathon.presencas.domain.ListaPresenca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListaPresencaRepository extends JpaRepository <ListaPresenca, Integer> {
}
