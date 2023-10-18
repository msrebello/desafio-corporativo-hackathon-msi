package com.msi.comporativo.desafiohackathon.empresas.domain;

import javax.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name="Empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idempresa")
    private Integer id;  // Usando Long para permitir autoincremento.

    private String nome;



    // Getters e Setters, construtores, outros métodos, etc.

    // Construtores, outros métodos, getters e setters, etc.


}
