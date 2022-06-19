public class Frete extends MarketDecorator{
    public Frete(Marketplace marketplace) {
        super(marketplace);
    }

    public float getValorExtra() {
        return 20f;
    }

    public String getElementoNotaFiscal() {
        return "Frete: " + getValorExtra();
    }
}
