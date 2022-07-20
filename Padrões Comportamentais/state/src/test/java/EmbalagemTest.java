import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmbalagemTest {

    Embalagem embalagem;

    @BeforeEach
    public void setUp() {
        embalagem = new Embalagem();
    }

    // Fabricação
    @Test
    public void embalagemEmFabricacaoNaoPodeSerFabricada() {
        embalagem.setEstado(EmbalagemEstadoFabricado.getInstance());
        assertFalse(embalagem.fabricar());
    }
    @Test
    public void embalagemEmFabricacaoNaoPodeSerEstocada() {
        embalagem.setEstado(EmbalagemEstadoFabricado.getInstance());
        assertFalse(embalagem.estocar());
    }
    @Test
    public void embalagemEmFabricacaoNaoPodeSerDescartada() {
        embalagem.setEstado(EmbalagemEstadoFabricado.getInstance());
        assertFalse(embalagem.descartar());
    }
    @Test
    public void embalagemEmFabricacaoNaoPodeSerReciclada() {
        embalagem.setEstado(EmbalagemEstadoFabricado.getInstance());
        assertFalse(embalagem.reciclar());
    }
    @Test
    public void embalagemFabricadaPodeSerTestada() {
        embalagem.setEstado(EmbalagemEstadoFabricado.getInstance());
        assertTrue(embalagem.testar());
        assertEquals(EmbalagemEstadoTestado.getInstance(), embalagem.getEstado());
    }


    // Testagem

    @Test
    public void embalagemEmTestagemNaoPodeSerFabricada() {
        embalagem.setEstado(EmbalagemEstadoTestado.getInstance());
        assertFalse(embalagem.fabricar());
    }
    @Test
    public void embalagemEmTestagemPodeSerEstocada() {
        embalagem.setEstado(EmbalagemEstadoTestado.getInstance());
        assertTrue(embalagem.estocar());
        assertEquals(EmbalagemEstadoEstocado.getInstance(), embalagem.getEstado());
    }
    @Test
    public void embalagemEmTestagemPodeSerDescartada() {
        embalagem.setEstado(EmbalagemEstadoTestado.getInstance());
        assertTrue(embalagem.descartar());
        assertEquals(EmbalagemEstadoDescartado.getInstance(), embalagem.getEstado());
    }
    @Test
    public void embalagemEmTestagemPodeSerReciclada() {
        embalagem.setEstado(EmbalagemEstadoTestado.getInstance());
        assertTrue(embalagem.reciclar());
        assertEquals(EmbalagemEstadoReciclado.getInstance(), embalagem.getEstado());
    }
    @Test
    public void embalagemEmTestagemNaoPodeSerTestada() {
        embalagem.setEstado(EmbalagemEstadoTestado.getInstance());
        assertFalse(embalagem.testar());
    }

    // Estocagem

    @Test
    public void embalagemEmEstoqueNaoPodeSerFabricada() {
        embalagem.setEstado(EmbalagemEstadoEstocado.getInstance());
        assertFalse(embalagem.fabricar());
    }
    @Test
    public void embalagemEmEstoqueNaoPodeSerEstocada() {
        embalagem.setEstado(EmbalagemEstadoEstocado.getInstance());
        assertFalse(embalagem.estocar());
    }
    @Test
    public void embalagemEmEstoqueNaoPodeSerDescartada() {
        embalagem.setEstado(EmbalagemEstadoEstocado.getInstance());
        assertFalse(embalagem.descartar());
    }
    @Test
    public void embalagemEmEstoqueNaoPodeSerReciclada() {
        embalagem.setEstado(EmbalagemEstadoEstocado.getInstance());
        assertFalse(embalagem.reciclar());
    }
    @Test
    public void embalagemEmEstoqueNaoPodeSerTestada() {
        embalagem.setEstado(EmbalagemEstadoEstocado.getInstance());
        assertFalse(embalagem.testar());
    }


    // Descarte

    @Test
    public void embalagemEmDescarteNaoPodeSerFabricada() {
        embalagem.setEstado(EmbalagemEstadoDescartado.getInstance());
        assertFalse(embalagem.fabricar());
    }
    @Test
    public void embalagemEmDescarteNaoPodeSerEstocada() {
        embalagem.setEstado(EmbalagemEstadoDescartado.getInstance());
        assertFalse(embalagem.estocar());
    }
    @Test
    public void embalagemEmDescarteNaoPodeSerDescartada() {
        embalagem.setEstado(EmbalagemEstadoDescartado.getInstance());
        assertFalse(embalagem.descartar());
    }
    @Test
    public void embalagemEmDescarteNaoPodeSerReciclada() {
        embalagem.setEstado(EmbalagemEstadoDescartado.getInstance());
        assertFalse(embalagem.reciclar());
    }
    @Test
    public void embalagemEmDescarteNaoPodeSerTestada() {
        embalagem.setEstado(EmbalagemEstadoDescartado.getInstance());
        assertFalse(embalagem.testar());
    }


    // Reciclagem

    @Test
    public void embalagemEmReciclagemPodeSerFabricada() {
        embalagem.setEstado(EmbalagemEstadoReciclado.getInstance());
        assertTrue(embalagem.fabricar());
        assertEquals(EmbalagemEstadoFabricado.getInstance(), embalagem.getEstado());
    }
    @Test
    public void embalagemEmReciclagemNaoPodeSerEstocada() {
        embalagem.setEstado(EmbalagemEstadoReciclado.getInstance());
        assertFalse(embalagem.estocar());
    }
    @Test
    public void embalagemEmReciclagemNaoPodeSerDescartada() {
        embalagem.setEstado(EmbalagemEstadoReciclado.getInstance());
        assertFalse(embalagem.descartar());
    }
    @Test
    public void embalagemEmReciclagemNaoPodeSerReciclada() {
        embalagem.setEstado(EmbalagemEstadoReciclado.getInstance());
        assertFalse(embalagem.reciclar());
    }
    @Test
    public void embalagemEmReciclagemNaoPodeSerTestada() {
        embalagem.setEstado(EmbalagemEstadoReciclado.getInstance());
        assertFalse(embalagem.testar());
    }

}