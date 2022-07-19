package com.example.veiculos.repository;

import com.example.veiculos.model.Veiculo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.Arrays;
import java.util.List;

@Repository
public class VeiculoRepository {
    private final String linkFileVeiculos = "src/main/resources/veiculos.json";

    public List<Veiculo> getAllVeiculos() {
        ObjectMapper mapper = new ObjectMapper();
        List<Veiculo> veiculosList = null;

        try {
            veiculosList = Arrays.asList(mapper.readValue(new File(linkFileVeiculos), Veiculo[].class));
        } catch (Exception ex) {
            System.out.println("Problem in getAllVeiculos veiculoRepository");
        }
        return veiculosList;
    }
}
