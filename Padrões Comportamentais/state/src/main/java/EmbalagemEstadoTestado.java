public class EmbalagemEstadoTestado extends EmbalagemEstado{
    private static EmbalagemEstadoTestado instance = new EmbalagemEstadoTestado();
    public static EmbalagemEstadoTestado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Testado";
    }

    public boolean estocar(Embalagem embalagem) {
        embalagem.setEstado(EmbalagemEstadoEstocado.getInstance());
        return true;
    }
    public boolean descartar(Embalagem embalagem) {
        embalagem.setEstado(EmbalagemEstadoDescartado.getInstance());
        return true;
    }
    public boolean reciclar(Embalagem embalagem) {
        embalagem.setEstado(EmbalagemEstadoReciclado.getInstance());
        return true;
    }
}
