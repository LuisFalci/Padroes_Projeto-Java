package builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PassagemBuilderTest {
    @Test
    void deveRetornarExcecaoDeCodigo() {
        try {
            PassagemBuilder passagemBuilder = new PassagemBuilder();
            Passagem passagem = passagemBuilder
                    .setCodigo(0)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Código de Voo inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoDeHoraChegada() {
        try {
            PassagemBuilder passagemBuilder = new PassagemBuilder();
            Passagem passagem = passagemBuilder
                    .setCodigo(123)
                    .setCidadeSaida("Roma")
                    .setCidadeDestino("Barbacena")
                    .setHoraChegada("22:401")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Formato de hora inválido", e.getMessage());
        }
    }

    @Test
    void deveValidarVoo() {

            PassagemBuilder passagemBuilder = new PassagemBuilder();
            Passagem passagem = passagemBuilder
                    .setCodigo(123)
                    .setCidadeSaida("Roma")
                    .setCidadeDestino("Barbacena")
                    .setHoraChegada("22:40")
                    .setClasse("eXecUtiVA")
                    .build();

            assertTrue(passagem.getValidacao());
    }
}