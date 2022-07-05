package com.dh.meli.spring02.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.naming.InterruptedNamingException;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Veiculo implements Comparable<Veiculo> {
    private String placa;
    private String modelo;
    private double valor;
    private String renavam;

    // define que ao comparar 2 objetos do tipo veículo o que será levado
    // em consideração para saber se são igual é a propriedade valor
    @Override
    public int compareTo(Veiculo outro) {
        return ((int) (this.valor - outro.getValor()));
    }
}
