public class EmbalagemEstadoDescartado extends EmbalagemEstado{

    private EmbalagemEstadoDescartado() {};

    private static EmbalagemEstadoDescartado instance = new EmbalagemEstadoDescartado();
    public static EmbalagemEstadoDescartado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Descartado";
    }

}
