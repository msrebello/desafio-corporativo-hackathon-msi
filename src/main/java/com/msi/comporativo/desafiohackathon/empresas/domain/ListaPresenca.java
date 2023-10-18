package com.msi.comporativo.desafiohackathon.empresas.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="Presenca")
public class ListaPresenca {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idPresenca")
    private Integer id;  // Usando Long para permitir autoincremento.

    private String nome;

    // Getters e Setters, construtores, outros métodos, etc.

    // Construtores, outros métodos, getters e setters, etc.


}
