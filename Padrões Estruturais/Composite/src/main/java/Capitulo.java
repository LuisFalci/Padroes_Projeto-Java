import java.util.ArrayList;
import java.util.List;

//Composite
public class Capitulo extends Estrutura {

    private List<Estrutura> estruturas;

    public Capitulo(String conteudo) {
        super(conteudo);
        this.estruturas = new ArrayList<Estrutura>();
    }

    public void addConteudo(Estrutura estrutura) {
        this.estruturas.add(estrutura);
    }

    public String getEstrutura() {
        String resultado = "";
        resultado = "Livro: " + this.getConteudo() + "\n";
        for (Estrutura estrutura : estruturas) {
            resultado = resultado + estrutura.getEstrutura();
        }
        return resultado;
    }
}