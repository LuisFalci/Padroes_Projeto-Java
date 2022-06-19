import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    @Test
    void deveRetornarValorEmRadianos() {
        Calculadora calculadora = new Calculadora();
        calculadora.setCircunferencia("TT/6");

        assertEquals("TT/6", calculadora.getCircunferencia());
    }

    @Test
    void deveRetornarValorEmGraus() {
        Calculadora calculadora = new Calculadora();
        calculadora.setCircunferencia("TT/6");

        assertEquals(30, calculadora.getGraus());
    }
}