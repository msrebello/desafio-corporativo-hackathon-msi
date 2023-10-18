package com.msi.comporativo.desafiohackathon.obras.application;

import com.msi.comporativo.desafiohackathon.obras.domain.Obra;
import com.msi.comporativo.desafiohackathon.obras.infrastructure.ObraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/obra")
public class ObraController {

    @Autowired
    ObraRepository obraRepository;

    @GetMapping
    public List<Obra> getAll(){
        return obraRepository.findAll();
    }
}
