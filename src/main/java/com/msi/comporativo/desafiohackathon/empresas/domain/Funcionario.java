package com.msi.comporativo.desafiohackathon.empresas.domain;

import jakarta.persistence.*;
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

    // Getters e Setters, construtores, outros métodos, etc.

    // Construtores, outros métodos, getters e setters, etc.


}
