package com.dh.meli.spring02.controller;

import com.dh.meli.spring02.dto.VeiculoDto;
import com.dh.meli.spring02.model.Veiculo;
import com.dh.meli.spring02.repository.VeiculoRepo;
import com.dh.meli.spring02.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

    @Autowired
    private VeiculoService service;

    @GetMapping("/{placa}")
    public ResponseEntity<VeiculoDto> getVeiculo(@PathVariable String placa) {
        return ResponseEntity.ok().body(service.getVeiculo(placa));
    }

    @GetMapping("/all")
    public ResponseEntity<List<VeiculoDto>> getAllVeiculo() {
        List<VeiculoDto> v = service.getAllVeiculo();
        return ResponseEntity.ok(v);
    }

    @GetMapping("/all/order/valor")
    public ResponseEntity<List<VeiculoDto>> getAllVeiculoOrderByValor() {
        List<VeiculoDto> v = service.getAllOrderByValor();
        return ResponseEntity.ok(v);
    }

    @GetMapping("/all/order/modelo")
    public ResponseEntity<List<VeiculoDto>> getAllVeiculoOrderByModelo() {
        List<VeiculoDto> v = service.getAllOrderByModelo();
        return ResponseEntity.ok(v);
    }

    @GetMapping("/modelo/{modelo}")
    public ResponseEntity<List<VeiculoDto>> getAllVeiculoOrderByModelo(@PathVariable String modelo) {
        List<VeiculoDto> v = service.getByModelo(modelo);
        return ResponseEntity.ok(v);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void saveVeiculo(@RequestBody Veiculo novoVeiculo) {
        service.saveVeiculo(novoVeiculo);
    }
}
