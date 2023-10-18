package com.msi.comporativo.desafiohackathon.empresas.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="Obra")
public class Obra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idObra")
    private Integer id;  // Usando Long para permitir autoincremento.
    @Column(name="descricao")
    private String descricao;

    // Getters e Setters, construtores, outros métodos, etc.

    // Construtores, outros métodos, getters e setters, etc.


}
