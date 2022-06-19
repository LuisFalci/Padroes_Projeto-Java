import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoEditarPerfilTest {
    @Test
    void deveExecutarFormatura() {
        IServico servico = ServicoFactory.obterServico("EditarPerfil");
        assertEquals("Perfil Editado com Sucesso", servico.executar());
    }

    @Test
    void deveCancelarFormatura() {
        IServico servico = ServicoFactory.obterServico("EditarPerfil");
        assertEquals("Alteração foi Cancela", servico.cancelar());
    }
}