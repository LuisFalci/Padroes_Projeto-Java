import java.util.ArrayList;
import java.util.List;

public class Jogo {
    private List<Boneco> bonecos = new ArrayList<>();

    public void criarPersonagem(String codigo, String tipo, String cor) {
        Capacete capacete = CapaceteFactory.getCapacete(tipo, cor);
        Boneco boneco = new Boneco(codigo, capacete);
        bonecos.add(boneco);
    }

    public List<String> obterBonecos() {
        List<String> saida = new ArrayList<String>();
        for (Boneco boneco : this.bonecos) {
            saida.add(boneco.obterBoneco());
        }
        return saida;
    }
}
