public class CDB implements Calculo {
    private float cdb = 1.05f;

public float calcular(float valor, int meses){
    return (valor * meses * cdb);
}
}
