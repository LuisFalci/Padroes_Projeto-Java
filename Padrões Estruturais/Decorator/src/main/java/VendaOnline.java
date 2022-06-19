public class VendaOnline implements Marketplace{
    public float valor;

    public VendaOnline() {
    }

    public VendaOnline(float valor) {
        this.valor = valor;
    }

    public float getValorTotal() {
        return valor;
    }

    public String getEstruturaNotaFiscal() {
        return ("Nota Fiscal - Valor da Compra: " + getValorTotal());
    }
}
