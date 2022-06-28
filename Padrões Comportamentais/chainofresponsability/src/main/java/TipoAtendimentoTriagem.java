public class TipoAtendimentoTriagem implements TipoAtendimento{
    private static TipoAtendimentoTriagem tipoAtendimentoTriagem = new TipoAtendimentoTriagem();

    private TipoAtendimentoTriagem() {};

    public static TipoAtendimentoTriagem getTipoAtendimentoTriagem() {
        return tipoAtendimentoTriagem;
    }
}
