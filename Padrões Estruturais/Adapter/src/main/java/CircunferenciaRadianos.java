public class CircunferenciaRadianos implements ICircunferencia {
    private String radianos;

    @Override
    public String getCircunferencia() {
        return this.radianos;
    }

    @Override
    public void setCircunferencia(String radianos) {
        this.radianos = radianos;
    }
}
