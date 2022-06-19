import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoFazerComentarioTest {
    @Test
    void deveExecutarFormatura() {
        IServico servico = ServicoFactory.obterServico("FazerComentario");
        assertEquals("Comentário Efetuado com Sucesso", servico.executar());
    }

    @Test
    void deveCancelarFormatura() {
        IServico servico = ServicoFactory.obterServico("FazerComentario");
        assertEquals("Comentário foi Removido", servico.cancelar());
    }
}