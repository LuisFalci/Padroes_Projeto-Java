import java.util.Iterator;

public class Comprar {

    public static String jogosComDesconto(Carrinho carrinho) {
        String jogosDesconto= "Jogos com desconto = ";
        String jogoSemDesconto= "Jogos sem desconto = ";

        for (Jogo jogo : carrinho) {
            if (jogo.isCupomDesconto()) {
                jogosDesconto += jogo.getNome() + " - ";
            }else{
                jogoSemDesconto += jogo.getNome() + " - ";
            }
        }
        String jogos = jogosDesconto + "" + jogoSemDesconto;
        return jogos;
    }

    public static Integer jogosDoCarrinho(Carrinho carrinho) {
        int cont = 0;
        for (Iterator a = carrinho.iterator(); a.hasNext(); ) {
            cont++;
            a.next();
        }
        return cont;
    }

}