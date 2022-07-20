public class Investimento {
    private float valor;
    private int meses;

    public Investimento(float valor, int meses) {
        this.valor = valor;
        this.meses = meses;
    }

    public float calcular(Calculo calculo){
        return calculo.calcular(valor, meses);
    }
}
