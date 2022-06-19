import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    @Test
    void deveRetornarSmartphoneSamsungProduzido() {
        SmartphoneFacade smartphoneFacade = new SmartphoneFacade();

        assertEquals(smartphoneFacade.produzirSamsung(), "Smartphone Samsung produzido");
    }
    @Test
    void deveRetornarSmartphoneAsusProduzido() {
        SmartphoneFacade smartphoneFacade = new SmartphoneFacade();

        assertEquals(smartphoneFacade.produzirAsus(), "Smartphone Asus produzido");
    }
    @Test
    void deveRetornarSmartphoneMotorolaProduzido() {
        SmartphoneFacade smartphoneFacade = new SmartphoneFacade();

        assertEquals(smartphoneFacade.produzirMotorola(), "Smartphone Motorola produzido");
    }
}