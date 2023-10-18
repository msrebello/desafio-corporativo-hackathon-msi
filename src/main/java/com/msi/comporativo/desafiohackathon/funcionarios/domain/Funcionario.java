package com.msi.comporativo.desafiohackathon.funcionarios.domain;

import javax.persistence.*;

import com.msi.comporativo.desafiohackathon.empresas.domain.Empresa;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name="Funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @Column(name="idFuncionario")
    private Integer id;  // Usando Long para permitir autoincremento.
    @Column(name="nomeFuncionario")
    private String nome;
    @Column(name="dataAdmissao")
    private LocalDateTime dataAdmissao;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idEmpresa", referencedColumnName = "idEmpresa", foreignKey = @ForeignKey(name = "fk_empresa_id", value = ConstraintMode.CONSTRAINT))
    private Empresa empresa;

    // Getters e Setters, construtores, outros métodos, etc.

    // Construtores, outros métodos, getters e setters, etc.


}
