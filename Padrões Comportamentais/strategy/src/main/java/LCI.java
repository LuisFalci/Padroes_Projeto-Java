public class LCI implements Calculo {
    private float lci = 1.10f;

    public float calcular(float valor, int meses){
        return (valor * meses * lci);
    }
}
