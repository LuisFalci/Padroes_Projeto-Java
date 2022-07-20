public class TesouroDireto implements Calculo {
    private float tesouroDireto = 1.025f;

    public float calcular(float valor, int meses){
        return (valor * meses * tesouroDireto);
    }
}
