import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList listaAtendimentos = new ArrayList();
    private Funcionario funcionarioSeguinte;

    public Funcionario getFuncionarioSeguite() {
        return funcionarioSeguinte;
    }

    public void setFuncionarioSeguinte(Funcionario funcionarioSeguinte) {
        this.funcionarioSeguinte = funcionarioSeguinte;
    }

    public abstract String getDescricaoCargo();

    public String efetuarAtendimento(Atendimento atendimento) {

        if (listaAtendimentos.contains(atendimento.getTipoAtendimento())) {
            return getDescricaoCargo();
        }
        else {
            if (funcionarioSeguinte != null) {
                return funcionarioSeguinte.efetuarAtendimento(atendimento);
            }
            else
            {
                return "Não houve atendimento";
            }
        }
    }
}