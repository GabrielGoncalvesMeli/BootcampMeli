package com.calculadora.calorias.controller;

import com.calculadora.calorias.model.Ingredientes;
import com.calculadora.calorias.model.Pratos;
import com.calculadora.calorias.repository.FoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("restaurante")
public class IngredientesController {

    @Autowired
    private FoodsRepository foodsRepository;

    @GetMapping("ingredients")
    public ResponseEntity<List<Ingredientes>> allIngredients () {
        List<Ingredientes> ingredients = foodsRepository.getAllIngredients();
        if(ingredients != null) return ResponseEntity.ok(ingredients);
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/pratos")
    public ResponseEntity<List<Pratos>> allPlates () {
        List<Pratos> pratos = foodsRepository.getAllPratos();
        if(pratos != null) return ResponseEntity.ok(pratos);
        return ResponseEntity.notFound().build();
    }
}
