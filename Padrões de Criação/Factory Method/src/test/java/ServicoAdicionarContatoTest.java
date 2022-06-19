import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoAdicionarContatoTest {
    @Test
    void deveExecutarFormatura() {
        IServico servico = ServicoFactory.obterServico("AdicionarContato");
        assertEquals("Solicitação Enviada com Sucesso", servico.executar());
    }

    @Test
    void deveCancelarFormatura() {
        IServico servico = ServicoFactory.obterServico("AdicionarContato");
        assertEquals("Solicitação de Amizade Cancelada", servico.cancelar());
    }
}