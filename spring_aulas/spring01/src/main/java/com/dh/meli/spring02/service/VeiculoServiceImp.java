package com.dh.meli.spring02.service;

import com.dh.meli.spring02.dto.VeiculoDto;
import com.dh.meli.spring02.model.Veiculo;
import com.dh.meli.spring02.repository.VeiculoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VeiculoServiceImp implements VeiculoService{

    @Autowired // injeção de depencencia
    private VeiculoRepo repo;

    @Override
    public VeiculoDto getVeiculo(String placa) {
        VeiculoDto veiculoDto = new VeiculoDto(repo.getVeiculo(placa));
        return veiculoDto;
    }

    @Override
    public List<VeiculoDto> getAllVeiculo() {
        List<Veiculo> listaVeiculo = repo.getAllVeiculo();
        List<VeiculoDto> listaDto = listaVeiculo.stream()
                .map(v -> new VeiculoDto(v)) // VeiculoDto::new
                .collect(Collectors.toList());
        return listaDto;
    }

    @Override
    public void saveVeiculo(Veiculo novoVeiculo) {
        repo.saveVeiculo(novoVeiculo);
    }

    @Override
    public List<VeiculoDto> getAllOrderByValor() {
        List<Veiculo> listaVeiculos = repo.getAllVeiculo();
        return listaVeiculos.stream()
                .sorted()
                .map(v -> new VeiculoDto(v))
                .collect(Collectors.toList());
    }

    @Override
    public List<VeiculoDto> getAllOrderByModelo() {
        List<Veiculo> listaVeiculos = repo.getAllVeiculo();
        return listaVeiculos.stream()
                .sorted((v1, v2) -> v1.getModelo().compareTo(v2.getModelo()))
                .map(v -> new VeiculoDto(v))
                .collect(Collectors.toList());
    }

    @Override
    public List<VeiculoDto> getByModelo(String modelo) {
        List<Veiculo> listaVeiculos = repo.getAllVeiculo();
        return listaVeiculos.stream()
                .filter(v -> v.getModelo().equalsIgnoreCase(modelo))  // ignore case nao diferencia maiuscula e minuscula
                .map(v -> new VeiculoDto(v))
                .collect(Collectors.toList());
    }
}
