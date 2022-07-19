package com.example.veiculos.service;

import com.example.veiculos.dto.VeiculoDto;
import com.example.veiculos.model.Veiculo;
import com.example.veiculos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VeiculoService implements IVeiculoService{

    @Autowired
    private VeiculoRepository repository;

    @Override
    public List<VeiculoDto> getVeiculos() {
        List<VeiculoDto> listDtoVeiculos = null;
        try {
            List<Veiculo> listaVeiculos = repository.getAllVeiculos();
            listDtoVeiculos = listaVeiculos.stream()
                    .map(v -> new VeiculoDto(v))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("getVeiculos repository " + e);
        }
        return listDtoVeiculos;
    }

    @Override
    public VeiculoDto getVeiculo(int id) {
        return null;
    }

    @Override
    public List<VeiculoDto> getVeiculosByDates(LocalDateTime since, LocalDateTime to) {
        return null;
    }

    @Override
    public List<VeiculoDto> getVeiculosByPrice(LocalDateTime since, LocalDateTime to) {
        return null;
    }
}
