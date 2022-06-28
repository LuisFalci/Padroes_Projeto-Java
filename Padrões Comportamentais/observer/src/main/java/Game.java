import java.util.Observable;

public class Game extends Observable {

    private float price;
    private String name;
    private String duration;
    private boolean inSale;

    public Game(float price, String name, String duration, boolean inSale) {
        this.price = price;
        this.name = name;
        this.duration = duration;
        this.inSale = inSale;
    }

    public Game(float price, String name, boolean inSale) {
        this.price = price;
        this.name = name;
        this.inSale = inSale;
    }

    public void notifySale() {
       if(inSale){
           setChanged();
           notifyObservers();
       }
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "preco=" + price +
                ", nome=" + name +
                ", duration=" + duration +
                '}';
    }
}