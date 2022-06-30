package builder;

import java.util.Date;

//O padrão Builder pode ser reconhecido na classe que possui um único método de criação e vários métodos para configurar o objeto resultante
//Exemplo: passagemBuilder.setCodigo(123).setCidadeSaida("Roma").setCidadeDestino("Barbacena").build();

public class Passagem {
    private int codigo;
    private String cidadeSaida;
    private String cidadeDestino;
    private Date dataVoo;
    private String horaSaida;
    private String horaChegada;
    private String classe;
    private boolean validacao;

    public Passagem() {

    }

    
    public String getCidadeSaida() {
        return cidadeSaida;
    }

    public void setCidadeSaida(String cidadeSaida) {
        this.cidadeSaida = cidadeSaida;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(Date dataVoo) {
        this.dataVoo = dataVoo;
    }
    

    public String getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(String horaChegada) {
        this.horaChegada = horaChegada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public boolean getValidacao() { return validacao; }
    public void setValidacao(boolean validacao) {
        this.validacao = validacao;
    }
}
