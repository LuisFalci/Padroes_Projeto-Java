package singleton;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PassagemTest {
    @Test
    public void deveRetornarValorPassagem(){
        Passagem.getInstance().setValorPassagem(3.75);
        assertEquals(3.75, Passagem.getInstance().getValorPassagem());
    }
}