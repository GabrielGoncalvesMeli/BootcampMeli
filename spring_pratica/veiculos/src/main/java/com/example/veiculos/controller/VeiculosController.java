package com.example.veiculos.controller;

import com.example.veiculos.dto.VeiculoDto;
import com.example.veiculos.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
public class VeiculosController {

    @Autowired
    private VeiculoService service;

    @GetMapping("/veiculos")
    public ResponseEntity<List<VeiculoDto>> allVeiculos() {
        List<VeiculoDto> listVeiculos = service.getVeiculos();
        return ResponseEntity.ok(listVeiculos);
    }

    @GetMapping
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("teste");
    }
}
