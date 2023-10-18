package com.msi.comporativo.desafiohackathon.presencas.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.msi.comporativo.desafiohackathon.funcionarios.domain.Funcionario;
import com.msi.comporativo.desafiohackathon.obras.domain.Obra;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "presenca")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Presenca implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_presenca")
    private Integer id;  // Usando Long para permitir autoincremento.
    @Column(name = "data_presenca")
    private LocalDate dataPresenca;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_obra", referencedColumnName = "id_obra", foreignKey = @ForeignKey(name = "fk_obra_id", value = ConstraintMode.CONSTRAINT))
    private Obra obra;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_funcionario", referencedColumnName = "id_funcionario", foreignKey = @ForeignKey(name = "fk_funcionario_id", value = ConstraintMode.CONSTRAINT))
    private Funcionario funcionario;
}
