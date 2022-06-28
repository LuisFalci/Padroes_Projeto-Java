public class FuncionarioMedico extends Funcionario{
    public FuncionarioMedico(Funcionario seguinte) {
        listaAtendimentos.add(TipoAtendimentoMedico.getTipoAtendimentoMedico());
        setFuncionarioSeguinte(seguinte);
    }
    public String getDescricaoCargo() {
        return "Medico";
    }
}
