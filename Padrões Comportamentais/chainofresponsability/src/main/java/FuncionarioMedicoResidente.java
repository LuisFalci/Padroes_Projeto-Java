public class FuncionarioMedicoResidente extends Funcionario{
    public FuncionarioMedicoResidente(Funcionario seguinte) {
        listaAtendimentos.add(TipoAtendimentoAcompanhamento.getTipoAtendimentoAcompanhamento());
        setFuncionarioSeguinte(seguinte);
    }
    public String getDescricaoCargo() {
        return "Medico Residente";
    }
}
