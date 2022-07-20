public class EmbalagemEstadoFabricado extends EmbalagemEstado{
    private static EmbalagemEstadoFabricado instance = new EmbalagemEstadoFabricado();
    public static EmbalagemEstadoFabricado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Fabricado";
    }

    public boolean testar(Embalagem embalagem) {
        embalagem.setEstado(EmbalagemEstadoTestado.getInstance());
        return true;
    }
}
