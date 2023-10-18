package com.msi.comporativo.desafiohackathon.presencas.domain;

import com.msi.comporativo.desafiohackathon.presencas.infrastructure.PresencaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Component

public class PresencaService implements Serializable {

    @Autowired
    private PresencaRepository presencaRepository;

    public Set<String> getByObraIdAndDataPresenca(Integer obraId, LocalDate dataPresenca) {

        return presencaRepository.findByObraIdAndDataPresenca(obraId, dataPresenca).stream()
                .map(presenca ->
                        presenca.getFuncionario().getNome()
                ).collect(Collectors.toSet());
    }

    public List<Presenca> getAll() {
        return presencaRepository.findAll();
    }

    public ResponseEntity<String> save(PresencaDTO presencaDTO) {
        Optional<Presenca> presencaOptional = presencaRepository.findByObraIdAndDataPresencaAndFuncionarioId(presencaDTO.getObraId(), LocalDate.now(), presencaDTO.getFuncionarioId());
        if (presencaOptional.isPresent()) {
            return new ResponseEntity<>("Funcionario já lancado para data e obra informada!", HttpStatus.BAD_REQUEST);
        }

        Presenca presenca = presencaDTO.fromDTO();
        presencaRepository.save(presenca);
        return new ResponseEntity<>("Presenca lancada com sucesso!", HttpStatus.OK);
    }
}
