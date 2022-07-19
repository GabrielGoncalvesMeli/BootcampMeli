package dh.meli.testes.calculadora;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Calculadora {
    double n1, n2;

    public double dividir() {
        if(n2 == 0) {
            return 0;
        }
        return n1 / n2;
    }
}
