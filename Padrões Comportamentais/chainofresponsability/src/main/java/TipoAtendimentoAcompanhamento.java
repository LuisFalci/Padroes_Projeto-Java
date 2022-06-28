public class TipoAtendimentoAcompanhamento implements TipoAtendimento{
    private static TipoAtendimentoAcompanhamento tipoAtendimentoAcompanhamento = new TipoAtendimentoAcompanhamento();

    private TipoAtendimentoAcompanhamento() {};

    public static TipoAtendimentoAcompanhamento getTipoAtendimentoAcompanhamento() {
        return tipoAtendimentoAcompanhamento;
    }
}
