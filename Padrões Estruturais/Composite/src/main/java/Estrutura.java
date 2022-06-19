public abstract class Estrutura {

    private String conteudo;

    public Estrutura(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public abstract String getEstrutura();
}