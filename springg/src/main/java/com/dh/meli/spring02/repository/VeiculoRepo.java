package com.dh.meli.spring02.repository;

import com.dh.meli.spring02.model.Veiculo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class VeiculoRepo {
    private final String linkFile = "src/main/resources/dados.json";

    public List<Veiculo> getAllVeiculo() {
        ObjectMapper mapper = new ObjectMapper();
        List<Veiculo> lista = null;
        try {
            lista = Arrays.asList(mapper.readValue(new File(linkFile), Veiculo[].class));

        } catch (Exception e) {
            System.out.println("Erro getAllVeiculo" + e);
        }
        return lista;
    }

    public Veiculo getVeiculo(String placa) {
        Veiculo veiculo = null;
        ObjectMapper mapper = new ObjectMapper();
        List<Veiculo> lista = null;

        try {
            lista = Arrays.asList(mapper.readValue(new File(linkFile), Veiculo[].class));
            for (Veiculo v : lista) {
                if(v.getPlaca().equals(placa)) return v;
            }
        } catch (Exception ex) {
            System.out.println("Erro getVeiculo" + ex);
        }
        return null;
    }

    public void saveVeiculo(Veiculo novoVeiculo) {
        ObjectMapper mapper = new ObjectMapper(); //.enable(SerializationFeature.INDENT_OUTPUT);
        List<Veiculo> listaAtual = null;

        try {
            listaAtual = Arrays.asList(mapper.readValue(new File(linkFile), Veiculo[].class));
            List<Veiculo> listaCopia = new ArrayList<>(listaAtual);
            listaCopia.add(novoVeiculo);
            mapper.writeValue(new File(linkFile), listaCopia);
        } catch (Exception e) {
            System.out.println("Erro in saveVeiculo" + e);
        }
    }
}
