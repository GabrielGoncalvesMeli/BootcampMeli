package com.example.veiculos.service;

import com.example.veiculos.dto.VeiculoDto;

import java.time.LocalDateTime;
import java.util.List;

public interface IVeiculoService {
    List<VeiculoDto> getVeiculos();
    VeiculoDto getVeiculo(int id);
    List<VeiculoDto> getVeiculosByDates(LocalDateTime since, LocalDateTime to);
    List<VeiculoDto> getVeiculosByPrice(LocalDateTime since, LocalDateTime to);
}
