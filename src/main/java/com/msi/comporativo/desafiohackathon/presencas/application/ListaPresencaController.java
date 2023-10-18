package com.msi.comporativo.desafiohackathon.presencas.application;
import com.msi.comporativo.desafiohackathon.presencas.domain.ListaPresenca;
import com.msi.comporativo.desafiohackathon.presencas.infrastructure.ListaPresencaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/presencas")
public class ListaPresencaController {

    @Autowired
    ListaPresencaRepository listaPresencaRepository;

    @GetMapping
    public List<ListaPresenca> getAll(){
        return listaPresencaRepository.findAll();
    }
}
