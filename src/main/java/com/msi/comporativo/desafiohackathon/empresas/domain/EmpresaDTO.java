package com.msi.comporativo.desafiohackathon.empresas.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.msi.comporativo.desafiohackathon.funcionarios.domain.Funcionario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class EmpresaDTO implements Serializable {

    private Integer id;
    private String nome;
    private List<Funcionario> funcionarios;

    public EmpresaDTO fromEntity(Empresa empresa) {
        return EmpresaDTO.builder()
                .id(empresa.getId())
                .nome(empresa.getNome())
                .build();
    }
}
