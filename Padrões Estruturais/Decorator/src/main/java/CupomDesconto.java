public class CupomDesconto extends MarketDecorator{
    public CupomDesconto(Marketplace marketplace) {
        super(marketplace);
    }
    public float getValorExtra() {
        return -25f;
    }

    public String getElementoNotaFiscal() {
        return "Cupom de desconto: " + getValorExtra();
    }
}
