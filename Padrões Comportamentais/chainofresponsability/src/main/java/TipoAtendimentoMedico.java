public class TipoAtendimentoMedico implements TipoAtendimento{
    private static TipoAtendimentoMedico tipoAtendimentoMedico = new TipoAtendimentoMedico();

    private TipoAtendimentoMedico() {};

    public static TipoAtendimentoMedico getTipoAtendimentoMedico() {
        return tipoAtendimentoMedico;
    }
}
