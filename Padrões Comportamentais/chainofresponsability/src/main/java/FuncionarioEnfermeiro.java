public class FuncionarioEnfermeiro extends Funcionario{
    public FuncionarioEnfermeiro(Funcionario seguinte) {
        listaAtendimentos.add(TipoAtendimentoTriagem.getTipoAtendimentoTriagem());
        setFuncionarioSeguinte(seguinte);
    }
    public String getDescricaoCargo() {
        return "Enfermeiro";
    }
}
