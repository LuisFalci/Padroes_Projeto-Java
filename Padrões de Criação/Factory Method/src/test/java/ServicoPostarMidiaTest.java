import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoPostarMidiaTest {
    @Test
    void deveExecutarFormatura() {
        IServico servico = ServicoFactory.obterServico("PostarMidia");
        assertEquals("Upload de mídia feito com Sucesso", servico.executar());
    }

    @Test
    void deveCancelarFormatura() {
        IServico servico = ServicoFactory.obterServico("PostarMidia");
        assertEquals("Conteúdo excluido com sucesso", servico.cancelar());
    }
}