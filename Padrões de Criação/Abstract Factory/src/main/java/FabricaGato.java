public class FabricaGato implements FabricaAbstrata  {
    @Override
    public Ficha createFicha() {
        return new FichaGato();
    }

    @Override
    public Cadastro createCadastro() {
        return new CadastroGato();
    }
}
