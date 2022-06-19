import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    @Test
    void deveRetornarEstruturaDoLivro() {
        Capitulo capitulo1 = new Capitulo("Capitulo 1");

        Capitulo capitulo2 = new Capitulo("Capitulo 2");
        Secao secao21 = new Secao("Secao 1", 1);
        capitulo2.addConteudo(secao21);

        Capitulo capitulo3 = new Capitulo("Capitulo 3");
        Secao secao31 = new Secao("Secao 2", 2);
        Secao secao32 = new Secao("Secao 3", 3);
        capitulo3.addConteudo(secao31);
        capitulo3.addConteudo(secao32);

        Capitulo estruturaLivro = new Capitulo("Estrutura");
        estruturaLivro.addConteudo(capitulo1);
        estruturaLivro.addConteudo(capitulo2);
        estruturaLivro.addConteudo(capitulo3);

        Livro livro = new Livro();
        livro.setLivro(estruturaLivro);

        assertEquals("Livro: Estrutura\n" +
                "Livro: Capitulo 1\n" +
                "Livro: Capitulo 2\n" +
                "Titulo Secao: Secao 1 - Numero da Secao: 1\n" +
                "Livro: Capitulo 3\n" +
                "Titulo Secao: Secao 2 - Numero da Secao: 2\n" +
                "Titulo Secao: Secao 3 - Numero da Secao: 3\n", livro.getLivro());
    }
    }
