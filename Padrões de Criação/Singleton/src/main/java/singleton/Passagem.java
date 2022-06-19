package singleton;

//Padrão Singleton - garante que uma classe tenha apenas uma instância de si mesma,
//fornecendo um ponto global de acesso a ela.

public class Passagem {

    //Criamos um construtor privado, assim ela nunca será instânciada por nenhuma outra classe a não ser por ela mesma
    // (usando o método getInstance que é estático e assim pode ser acessado de qualquer outra classe sem precisar instanciar)

    private Passagem() {}
    private static Passagem instance = new Passagem();

    //Método static (permite chamar um método de uma classe sem instancia-lá) que instancia a classe

    public static Passagem getInstance(){
        return instance;
    }

    private double valorPassagem;

    public double getValorPassagem(){

        return this.valorPassagem;
    }

    public void setValorPassagem(double valorPassagem) {

        this.valorPassagem = valorPassagem;
    }
}

