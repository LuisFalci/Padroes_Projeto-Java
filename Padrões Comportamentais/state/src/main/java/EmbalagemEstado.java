public abstract class EmbalagemEstado {
    public abstract String getEstado();
    public boolean fabricar(Embalagem embalagem) {
        return false;
    }

    public boolean testar(Embalagem embalagem) {
        return false;
    }

    public boolean estocar(Embalagem embalagem) {
        return false;
    }

    public boolean descartar(Embalagem embalagem) {
        return false;
    }

    public boolean reciclar(Embalagem embalagem) {
        return false;
    }
}
