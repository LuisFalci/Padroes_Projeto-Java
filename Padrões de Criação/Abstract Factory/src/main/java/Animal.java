public class Animal {
    private Ficha ficha;
    private  Cadastro cadastro;

    public Animal (FabricaAbstrata fabrica) {
        this.ficha = fabrica.createFicha();
        this.cadastro = fabrica.createCadastro();
    }

    public String emitirFicha() {
        return this.ficha.gerar();
    }

    public String emitirCadastro() {
        return this.cadastro.cadastrar();
    }
}
