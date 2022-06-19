public abstract class MarketDecorator implements Marketplace{

    private Marketplace marketplace;
    public String notaFiscal;

    public MarketDecorator(Marketplace marketplace) {
        this.marketplace = marketplace;
    }

    public Marketplace getMarketplace() {
        return marketplace;
    }

    public void setMarketplace(Marketplace marketplace) {
        this.marketplace = marketplace;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public abstract float getValorExtra();

    public float getValorTotal() {
        return this.marketplace.getValorTotal() + this.getValorExtra();
    }

    public abstract String getElementoNotaFiscal();

    public String getEstruturaNotaFiscal() {
        return this.marketplace.getEstruturaNotaFiscal() + " - " + this.getElementoNotaFiscal()+" - ";
    }
}
