package dh.meli.testes.calculadora;

import dh.meli.testes.util.CalculadoraCreate;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    public void setup() {
        calculadora = CalculadoraCreate.create();
    }

    @Test
    @DisplayName("Valida parâmetros diferentes de zero")
    void dividirComRetornoNormal() {
        double expected = CalculadoraCreate.create().getN1() / CalculadoraCreate.create().getN2();

        double resultado = calculadora.dividir();

       assertEquals(expected, resultado);
    }

    @Test
    @DisplayName("Valida segundo parâmetro igual a zero")
    void dividirComRetornoZero() {
        double expected = 0;
        calculadora.setN2(0);

        double resultado = calculadora.dividir();

        assertEquals(expected, resultado);
    }
}