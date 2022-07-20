import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ComprarTest {
    @Test
    void deveRetornarJogosComCupomDesconto() {
        Carrinho carrinho = new Carrinho(
                new Jogo("Left 4 Dead", 221,true),
                new Jogo("MW4", 34,true),
                new Jogo("Halo", 53,false),
                new Jogo("Mario", 43,false)
        );
        assertEquals("Jogos com desconto = Left 4 Dead - MW4 - Jogos sem desconto = Halo - Mario - ", Comprar.jogosComDesconto(carrinho));
    }

    @Test
    void deveRetornarNumeroDeJogosDoCarrinho() {
        Carrinho carrinho = new Carrinho(
                new Jogo("Left 4 Dead", 221,true),
                new Jogo("MW4", 34,true),
                new Jogo("Halo", 53,false),
                new Jogo("Mario", 43,false),
                new Jogo("King Kong", 22,false),
                new Jogo("Forza", 534,true)

        );
        assertEquals(6, Comprar.jogosDoCarrinho(carrinho));
    }

}