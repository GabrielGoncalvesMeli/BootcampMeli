package com.calculadora.calorias.repository;

import com.calculadora.calorias.model.Ingredientes;
import com.calculadora.calorias.model.Pratos;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.Arrays;
import java.util.List;

@Repository
public class FoodsRepository {
    private final String linkFoodsFile = "src/main/resources/foods.json";
    private final String linkIngredientsFile = "src/main/resources/pratos.json";

    public List<Ingredientes> getAllIngredients() {
        ObjectMapper mapper = new ObjectMapper();
        List<Ingredientes> ingredientes = null;

        try {
            ingredientes = Arrays.asList(mapper.readValue(new File(linkFoodsFile), Ingredientes[].class));
        } catch(Exception e) {
            System.out.println("Erro getAllIngredients " + e);
        }

        return ingredientes;
    }

    public List<Pratos> getAllPratos() {
        ObjectMapper mapper = new ObjectMapper();
        List<Pratos> pratos = null;

        try {
            pratos = Arrays.asList(mapper.readValue(new File(linkIngredientsFile), Pratos[].class));
        } catch(Exception e) {
            System.out.println("Erro getAllPratos " + e);
        }

        return pratos;
    }
}
