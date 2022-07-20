public class Jogo {

    private String nome;
    private float preco;
    private boolean cupomDesconto;

    public Jogo(String nome, float preco, boolean cupomDesconto) {
        this.nome = nome;
        this.preco = preco;
        this.cupomDesconto = cupomDesconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isCupomDesconto() {
        return cupomDesconto;
    }

    public void setDesconto(boolean desconto) {
        this.cupomDesconto = desconto;
    }
}