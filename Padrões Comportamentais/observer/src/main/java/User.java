import java.util.Observable;
import java.util.Observer;

public class User implements Observer {

    private String userName;
    private String email;
    private String message;

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public String getMensagem() {
        return this.message;
    }

    public void addGameToList(Game game) {
        game.addObserver(this);
    }

    public void update(Observable game, Object arg1) {
        this.message = "Enviado para: " + this.email + " - Olá " + this.userName + ", o jogo que você está de olho está em promoção - " + game.toString();
        // System.out.println(this.ultimaNotificacao);
    }
}