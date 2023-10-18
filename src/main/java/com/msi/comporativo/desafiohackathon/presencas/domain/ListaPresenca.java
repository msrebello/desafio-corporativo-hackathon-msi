package com.msi.comporativo.desafiohackathon.presencas.domain;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="Presenca")
public class ListaPresenca {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idPresenca")
    private Integer id;  // Usando Long para permitir autoincremento.




    // Getters e Setters, construtores, outros métodos, etc.

    // Construtores, outros métodos, getters e setters, etc.


}
