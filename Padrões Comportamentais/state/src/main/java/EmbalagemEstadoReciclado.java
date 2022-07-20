public class EmbalagemEstadoReciclado extends EmbalagemEstado{
    private static EmbalagemEstadoReciclado instance = new EmbalagemEstadoReciclado();
    public static EmbalagemEstadoReciclado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Reciclado";
    }

    public boolean fabricar(Embalagem embalagem) {
        embalagem.setEstado(EmbalagemEstadoFabricado.getInstance());
        return true;
    }
}
