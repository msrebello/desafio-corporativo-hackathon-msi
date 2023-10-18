package com.msi.comporativo.desafiohackathon.obras.domain;

import javax.persistence.*;
import lombok.Data;

import java.util.List;

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
