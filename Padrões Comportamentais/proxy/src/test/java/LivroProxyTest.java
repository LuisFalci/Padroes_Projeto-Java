import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class LivroProxyTest {
    @BeforeEach
    void setUp() {
        BD.addLivro(new Livro(1, "Gateway A2", "2022", "Macmillan Education", "MB3232"));
        BD.addLivro(new Livro(2, "Gateway A1", "2022", "Macmillan Education", "IS32DS32"));
        BD.addLivro(new Livro(3, "Gateway B1", "2021", "Macmillan Education", "IS373DD2"));
    }

    @Test
    void deveRetornarDadosDoLivro() {
        LivroProxy livro = new LivroProxy(1);

        assertEquals(Arrays.asList("Gateway A2", "2022", "Macmillan Education"), livro.acessarLivro());
    }

    @Test
    void deveRetornarCodigoDeAcessoDoLivro() {
        Usuario usuario = new Usuario("Marco", true);
        LivroProxy livro = new LivroProxy(2);

        assertEquals("IS32DS32", livro.buscarCodigoAcesso(usuario));
    }

    @Test
    void deveRetornarExcessaoDeUsuario() {
        try {
            Usuario usuario = new Usuario("Falci", false);
            LivroProxy livro = new LivroProxy(2);

            livro.buscarCodigoAcesso(usuario);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Usuario não tem permissão de administrador para esta ação", e.getMessage());
        }
    }

}