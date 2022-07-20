import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class InvestidorTest {
    @Test
    void deveRetornarInvestimentoCDB() {
        Investidor investidor = new Investidor();
        investidor.calcularCDB(50000f, 6);
        assertEquals(315000f, investidor.getRetornoInvestimento());
    }
    @Test
    void deveRetornarInvestimentoFundoDeInvestimento() {
        Investidor investidor = new Investidor();
        investidor.calcularFundoInvestimento(50000f, 6);
        assertEquals(345000f, investidor.getRetornoInvestimento());
    }
    @Test
    void deveRetornarInvestimentoLCI() {
        Investidor investidor = new Investidor();
        investidor.calcularLCI(50000f, 6);
        assertEquals(330000f, investidor.getRetornoInvestimento());
    }
    @Test
    void deveRetornarInvestimentoTesouroDireto() {
        Investidor investidor = new Investidor();
        investidor.calcularTesouroDireto(50000f, 6);
        assertEquals(307500f, investidor.getRetornoInvestimento());
    }

}