import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendimentoTest {
    FuncionarioRecepcionista recepcionista;
    FuncionarioEnfermeiro enfermeiro;
    FuncionarioMedicoResidente medicoResidente;
    FuncionarioMedico medico;

    @BeforeEach
    void setUp() {
        medico = new FuncionarioMedico(null);
        medicoResidente = new FuncionarioMedicoResidente(medico);
        enfermeiro = new FuncionarioEnfermeiro(medicoResidente);
        recepcionista = new FuncionarioRecepcionista(enfermeiro);
    }
    
    

    @Test
    void deveRetornarAtendimentoDaRecepcionista() {
        assertEquals("Recepcionista", recepcionista.efetuarAtendimento(new Atendimento(TipoAtendimentoFicha.getTipoAtendimentoFicha())));
    }

    @Test
    void deveRetornarAtendimentoDoEnfermeiro() {
            assertEquals("Enfermeiro", recepcionista.efetuarAtendimento(new Atendimento(TipoAtendimentoTriagem.getTipoAtendimentoTriagem())));
    }

    @Test
    void deveRetornarAtendimentoDoMedicoResidente() {
        assertEquals("Medico Residente", recepcionista.efetuarAtendimento(new Atendimento(TipoAtendimentoAcompanhamento.getTipoAtendimentoAcompanhamento())));
    }

    @Test
    void deveRetornarAtendimentoDoMedico() {
        assertEquals("Medico", recepcionista.efetuarAtendimento(new Atendimento(TipoAtendimentoMedico.getTipoAtendimentoMedico())));
    }
}
