package com.msi.comporativo.desafiohackathon.empresas.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "empresa")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Empresa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa")
    private Integer id;
    private String nome;
}
