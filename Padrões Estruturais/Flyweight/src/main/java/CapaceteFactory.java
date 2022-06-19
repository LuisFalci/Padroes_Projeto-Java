import java.util.HashMap;
import java.util.Map;

public class CapaceteFactory {
    private static Map<String, Capacete> capacetes = new HashMap<>();

    public static Capacete getCapacete(String tipo, String cor) {
        Capacete capacete = capacetes.get(tipo);
        if (capacete == null) {
            capacete = new Capacete(tipo, cor);
            capacetes.put(tipo, capacete);
        }
        return capacete;
    }

    public static int getTotalCapacetes() {
        return capacetes.size();
    }
}
