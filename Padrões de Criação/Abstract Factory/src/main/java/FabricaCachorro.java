public class FabricaCachorro implements FabricaAbstrata {
    @Override
    public Ficha createFicha() {
        return new FichaCachorro();
    }

    @Override
    public Cadastro createCadastro() {
        return new CadastroCachorro();
    }
}
