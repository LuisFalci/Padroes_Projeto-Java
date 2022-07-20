public class FundoInvestimento implements Calculo {
    private float fundoInvestimento = 1.15f;

    public float calcular(float valor, int meses){
        return (valor * meses * fundoInvestimento);
    }
}
