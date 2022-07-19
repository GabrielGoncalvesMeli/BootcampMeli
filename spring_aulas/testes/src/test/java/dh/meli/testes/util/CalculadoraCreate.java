package dh.meli.testes.util;

import dh.meli.testes.calculadora.Calculadora;
import lombok.Data;

@Data
public class CalculadoraCreate {

    private static double n1 = 4, n2 = 2;

    public static Calculadora create() {
        return new Calculadora(n1, n2);
    }
}
