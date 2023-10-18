package com.msi.comporativo.desafiohackathon.obras.infrastructure;

import com.msi.comporativo.desafiohackathon.obras.domain.Obra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObraRepository extends JpaRepository<Obra, Integer> {
}
