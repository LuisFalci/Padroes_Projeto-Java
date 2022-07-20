public class Investidor {
    private float retornoInvestimento;

    public float getRetornoInvestimento() {
        return retornoInvestimento;
    }

    public void calcularFundoInvestimento(float valor, int meses) {
        Investimento investimento = new Investimento(valor, meses);
        this.retornoInvestimento = investimento.calcular(new FundoInvestimento());
    }
    public void calcularCDB(float valor, int meses) {
        Investimento investimento = new Investimento(valor, meses);
        this.retornoInvestimento = investimento.calcular(new CDB());
    }
    public void calcularLCI(float valor, int meses) {
        Investimento investimento = new Investimento(valor, meses);
        this.retornoInvestimento = investimento.calcular(new LCI());
    }
    public void calcularTesouroDireto(float valor, int meses) {
        Investimento investimento = new Investimento(valor, meses);
        this.retornoInvestimento = investimento.calcular(new TesouroDireto());
    }
}
