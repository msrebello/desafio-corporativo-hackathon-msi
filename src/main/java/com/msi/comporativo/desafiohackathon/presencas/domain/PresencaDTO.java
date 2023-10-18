package com.msi.comporativo.desafiohackathon.presencas.domain;

import com.msi.comporativo.desafiohackathon.funcionarios.domain.Funcionario;
import com.msi.comporativo.desafiohackathon.obras.domain.Obra;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class PresencaDTO implements Serializable {

    private Integer id;
    private Integer obraId;
    private Integer funcionarioId;

    public Presenca fromDTO() {
        Obra obra = Obra.builder().id(this.obraId).build();
        Funcionario funcionario = Funcionario.builder().id(this.funcionarioId).build();
        return Presenca.builder()
                .obra(obra)
                .funcionario(funcionario)
                .dataPresenca(LocalDate.now())
                .build();
    }
}
