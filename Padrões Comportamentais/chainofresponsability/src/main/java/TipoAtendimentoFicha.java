public class TipoAtendimentoFicha implements TipoAtendimento{
    private static TipoAtendimentoFicha tipoAtendimentoFicha = new TipoAtendimentoFicha();

    private TipoAtendimentoFicha() {};

    public static TipoAtendimentoFicha getTipoAtendimentoFicha() {
        return tipoAtendimentoFicha;
    }
}
