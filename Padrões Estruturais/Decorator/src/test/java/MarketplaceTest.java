import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MarketplaceTest {
    @Test
    void deveRetornarValorTotalDaCompranoMarketplace() {
        Marketplace marketplace = new VendaOnline(1000.0f);
//        System.out.println(marketplace.getEstruturaNotaFiscal());
        assertEquals(1000.0f, marketplace.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalDaCompranoMarketplaceComFrete() {

        Marketplace marketplace = new Frete(new VendaOnline(1000.0f));
        assertEquals(1020.0f, marketplace.getValorTotal());
    }
    @Test
    void deveRetornarValorTotalDaCompranoMarketplaceComFreteMaisTaxa() {

        Marketplace marketplace = new Frete(new Taxa(new VendaOnline(1000.0f)));
        assertEquals(1070.0f, marketplace.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalDaCompranoMarketplaceComFreteMaisTaxaMaisCupomDesconto() {
        Marketplace marketplace = new Frete(new Taxa(new CupomDesconto(new VendaOnline(1000.0f))));
        assertEquals(1045.0f, marketplace.getValorTotal());
    }

    @Test
    void deveRetornarNotaFiscalDaCompranoMarketplace() {
        Marketplace marketplace = new VendaOnline(1000.0f);
        assertEquals("Nota Fiscal - Valor da Compra: 1000.0", marketplace.getEstruturaNotaFiscal());
    }
    @Test
    void deveRetornarNotaFiscalDaCompranoMarketplaceComFrete() {
        Marketplace marketplace = new Frete(new VendaOnline(1000.0f));
        assertEquals("Nota Fiscal - Valor da Compra: 1000.0 - Frete: 20.0 - ", marketplace.getEstruturaNotaFiscal());
    }
    @Test
    void deveRetornarNotaFiscalDaCompranoMarketplaceComFreteMaisTaxa() {
        Marketplace marketplace = new Frete(new Taxa(new VendaOnline(1000.0f)));
        assertEquals("Nota Fiscal - Valor da Compra: 1000.0 - Taxa: 50.0 -  - Frete: 20.0 - ", marketplace.getEstruturaNotaFiscal());
    }
    @Test
    void deveRetornarNotaFiscalDaCompranoMarketplaceComFreteMaisTaxaMaisCupomDesconto() {
        Marketplace marketplace = new Frete(new Taxa(new CupomDesconto(new VendaOnline(1000.0f))));
        assertEquals("Nota Fiscal - Valor da Compra: 1000.0 - Cupom de desconto: -25.0 -  - Taxa: 50.0 -  - Frete: 20.0 - ", marketplace.getEstruturaNotaFiscal());
    }

}