import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AnimalTest {

    @Test
    void deveGerarFichaDoCachorro() {
        FabricaAbstrata fabrica = new FabricaCachorro();
        Animal animal = new Animal(fabrica);
        assertEquals("Ficha do Cachorro", animal.emitirFicha());
    }

    @Test
    void deveGerarCadastroDoCachorro() {
        FabricaAbstrata fabrica = new FabricaCachorro();
        Animal animal = new Animal(fabrica);
        assertEquals("Cadastro Cachorro", animal.emitirCadastro());
    }

    @Test
    void deveGerarFichaDoGato() {
        FabricaAbstrata fabrica = new FabricaGato();
        Animal animal = new Animal(fabrica);
        assertEquals("Ficha do Gato", animal.emitirFicha());
    }

    @Test
    void deveGerarCadastroDoGato() {
        FabricaAbstrata fabrica = new FabricaGato();
        Animal animal = new Animal(fabrica);
        assertEquals("Cadastro Gato", animal.emitirCadastro());
    }
}