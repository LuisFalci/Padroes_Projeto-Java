public class EmbalagemEstadoEstocado extends EmbalagemEstado{
    private static EmbalagemEstadoEstocado instance = new EmbalagemEstadoEstocado();
    public static EmbalagemEstadoEstocado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Esstocado";
    }
}
