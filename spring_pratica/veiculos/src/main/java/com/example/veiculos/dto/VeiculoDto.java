package com.example.veiculos.dto;


import com.example.veiculos.model.Veiculo;
import com.example.veiculos.model.VeiculoModelService;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class VeiculoDto {
    private String brand;
    private String model;
    private double price;
    private List<VeiculoModelService> services;

    public VeiculoDto(Veiculo veiculo) {
        this.brand = veiculo.getBrand();
        this.model = veiculo.getModel();
        this.price = veiculo.getPrice();
        this.services = veiculo.getServices();
    }
}
