//Component
public class Livro {

    private Estrutura livro;

    public void setLivro(Estrutura livro) {
        this.livro = livro;
    }

    public String getLivro() {
        return this.livro.getEstrutura();
    }
}