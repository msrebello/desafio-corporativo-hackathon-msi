package com.msi.comporativo.desafiohackathon.funcionarios.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.msi.comporativo.desafiohackathon.empresas.domain.Empresa;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "funcionario")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Funcionario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "increment")
    @Column(name = "id_funcionario")
    private Integer id;  // Usando Long para permitir autoincremento.
    @Column(name = "nome_funcionario")
    private String nome;
    @Column(name = "data_admissao")
    private LocalDateTime dataAdmissao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa", foreignKey = @ForeignKey(name = "fk_empresa_id", value = ConstraintMode.CONSTRAINT))
    private Empresa empresa;
}
