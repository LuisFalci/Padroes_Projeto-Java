import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class JogoTest {
    @Test
    void deveRetornarBonecos() {
        Jogo jogo = new Jogo();
        jogo.criarPersonagem("1", "Doidão", "Preto");
        jogo.criarPersonagem("12", "Legal", "Amarelo");
        jogo.criarPersonagem("123", "Doidão", "Branco");
        jogo.criarPersonagem("1234", "Maneiro", "Preto");

        List<String> saida = Arrays.asList(
                "Boneco{codigo='1', tipo capacete='Doidão', cor capacete='Preto'}",
                "Boneco{codigo='12', tipo capacete='Legal', cor capacete='Amarelo'}",
                "Boneco{codigo='123', tipo capacete='Doidão', cor capacete='Preto'}",
                "Boneco{codigo='1234', tipo capacete='Maneiro', cor capacete='Preto'}");

        assertEquals(saida, jogo.obterBonecos());
    }

    @Test
    void deveRetornarTotalCapacetes() {
        Jogo jogo = new Jogo();
        jogo.criarPersonagem("1", "Doidão", "Preto");
        jogo.criarPersonagem("12", "Legal", "Amarelo");
        jogo.criarPersonagem("123", "Doidão", "Branco");
        jogo.criarPersonagem("1234", "Maneiro", "Preto");

        assertEquals(3, CapaceteFactory.getTotalCapacetes());
    }


}