package builder;

import java.util.Date;

public class PassagemBuilder {
    private Passagem passagem;

    public PassagemBuilder() {
        passagem = new Passagem();
    }

    public Passagem build() {
        if (passagem.getCodigo() == 0) {
            throw new IllegalArgumentException("Código de Voo inválido");
        }
        if (passagem.getCidadeSaida() == "" || passagem.getCidadeSaida() == null || passagem.getCidadeSaida().equals(passagem.getCidadeDestino())) {
            throw new IllegalArgumentException("Cidade Saida de voo inválida");
        }

        if (passagem.getHoraChegada().length() != 5 || !passagem.getHoraChegada().contains(":")) {

            throw new IllegalArgumentException("Formato de hora inválido");
        }

        if (!passagem.getClasse().isEmpty()) {
            String nomeClasse;
            nomeClasse = passagem.getClasse().toUpperCase();

            if (nomeClasse.equals("EXECUTIVA") || nomeClasse.equals("ECONÔMICA") || nomeClasse.equals("PRIMEIRA CLASSE")) {
                passagem.setValidacao(true);
            }else {
                passagem.setValidacao(false);
            }
        }

        return passagem;
    }

    public PassagemBuilder setCidadeSaida(String cidadeSaida) {
        passagem.setCidadeSaida(cidadeSaida);
        return this;
    }

    public PassagemBuilder setCidadeDestino(String cidadeDestino) {
        passagem.setCidadeDestino(cidadeDestino);
        return this;
    }

    public PassagemBuilder setCodigo(int codigo) {
        passagem.setCodigo(codigo);
        return this;
    }

    public PassagemBuilder setDataVoo(Date dataVoo) {
        passagem.setDataVoo(dataVoo);
        return this;
    }

    public PassagemBuilder setHoraChegada(String horaChegada) {
        passagem.setHoraChegada(horaChegada);
        return this;
    }

    public PassagemBuilder setHoraSaida(String horaSaida) {
        passagem.setHoraSaida(horaSaida);
        return this;
    }

    public PassagemBuilder setClasse(String classe) {
        passagem.setClasse(classe);
        return this;
    }

    public PassagemBuilder setValidacao(boolean validacao) {
        passagem.setValidacao(validacao);
        return this;
    }
}
