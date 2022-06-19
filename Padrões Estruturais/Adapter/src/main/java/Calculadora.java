public class Calculadora {
    ICircunferencia circunferencia;
    CircunferenciaAdapter persistencia;

    public Calculadora() {
        circunferencia = new CircunferenciaRadianos();
        persistencia = new CircunferenciaAdapter(circunferencia);
    }

    public void setCircunferencia(String conceito) {
        circunferencia.setCircunferencia(conceito);
        persistencia.salvarResultado();
    }

    public String getCircunferencia() {
        return persistencia.resultado();
    }

    public float getGraus() {
        return persistencia.getGraus();
    }
}
