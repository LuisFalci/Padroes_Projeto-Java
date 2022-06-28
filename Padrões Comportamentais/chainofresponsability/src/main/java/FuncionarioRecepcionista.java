public class FuncionarioRecepcionista extends Funcionario{

    public FuncionarioRecepcionista(Funcionario seguinte) {
        listaAtendimentos.add(TipoAtendimentoFicha.getTipoAtendimentoFicha());
        setFuncionarioSeguinte(seguinte);
    }
    public String getDescricaoCargo() {
        return "Recepcionista";
    }
}
