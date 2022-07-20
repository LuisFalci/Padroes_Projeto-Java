public class Embalagem {
    private EmbalagemEstado estado;

    public EmbalagemEstado getEstado() {
        return estado;
    }

    public void setEstado(EmbalagemEstado estado) {
        this.estado = estado;
    }

    public boolean fabricar() {
        return estado.fabricar(this);
    }
    public boolean testar() {
        return estado.testar(this);
    }
    public boolean estocar() {
        return estado.estocar(this);
    }
    public boolean descartar() {
        return estado.descartar(this);
    }
    public boolean reciclar() {
        return estado.reciclar(this);
    }
}
