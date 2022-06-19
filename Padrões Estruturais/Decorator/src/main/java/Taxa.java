public class Taxa extends MarketDecorator{
    public Taxa(Marketplace marketplace) {
        super(marketplace);
    }

    public float getValorExtra() {
        return 50f;
    }

    public String getElementoNotaFiscal() {
        return "Taxa: " + getValorExtra();
    }
}
