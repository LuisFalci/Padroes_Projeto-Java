import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Carrinho implements Iterable<Jogo>{

    private List<Jogo> jogos = new ArrayList<Jogo>();

    public Carrinho(Jogo... jogos) {
        this.jogos = Arrays.asList(jogos);
    }

    @Override
    public Iterator<Jogo> iterator() {
        return jogos.iterator();
    }

}