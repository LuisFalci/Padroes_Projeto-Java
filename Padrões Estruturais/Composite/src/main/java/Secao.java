//leaf
public class Secao extends Estrutura {

    private int numeroSecao;

    public Secao(String conteudo, int numeroSecao) {
        super(conteudo);
        this.numeroSecao = numeroSecao;
    }

    public int getNumeroSecao() {
        return numeroSecao;
    }

    public void setNumeroSecao(int numeroSecao) {
        this.numeroSecao = numeroSecao;
    }

    public String getEstrutura() {
        return "Titulo Secao: " + this.getConteudo() + " - Numero da Secao: " + this.getNumeroSecao() + "\n";
    }
}