public class Boneco {
    private String codigo;
    private Capacete capacete;

    public Boneco(String codigo, Capacete capacete) {
        this.codigo = codigo;
        this.capacete = capacete;
    }

    public String obterBoneco() {
        return "Boneco{" +
                "codigo='" + this.codigo + '\'' +
                ", tipo capacete='" + capacete.getTipo() + '\'' +
                ", cor capacete='" + capacete.getCor() + '\'' +
                '}';
    }
}
