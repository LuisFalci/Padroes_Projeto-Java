import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void deveNotificarUsuario() {
        Game game = new Game(35, "Doom", "48 horas", true);
        User user = new User("luis", "luis@gmail.com");
        user.addGameToList(game);
        game.notifySale();
        assertEquals("Enviado para: luis@gmail.com - Olá luis, o jogo que você está de olho está em promoção - Jogo{preco=35.0, nome=Doom, duration=48 horas}", user.getMensagem());
    }

    @Test
    void naoDeveNotificarUsuario() {
        Game game = new Game(90, "Doom", false);
        User user = new User("luis", "luis@gmail.com");
        user.addGameToList(game);
        game.notifySale();
        assertEquals(null, user.getMensagem());
    }

    @Test
    void deveNotificarUsuarios() {
        Game game = new Game(35, "Mario", "90 horas", true);
        User user1 = new User("luis", "luis@gmail.com");
        User user2 = new User("joao", "joao@gmail.com");
        user1.addGameToList(game);
        user2.addGameToList(game);
        game.notifySale();
        assertEquals("Enviado para: luis@gmail.com - Olá luis, o jogo que você está de olho está em promoção - Jogo{preco=35.0, nome=Mario, duration=90 horas}", user1.getMensagem());
        assertEquals("Enviado para: joao@gmail.com - Olá joao, o jogo que você está de olho está em promoção - Jogo{preco=35.0, nome=Mario, duration=90 horas}", user2.getMensagem());
    }

    @Test
    void deveNotificarUsuarioLuis() {
        Game game1 = new Game(35, "Mario", "90 horas", true);
        Game game2 = new Game(200, "Diablo", "60 horas", true);
        User user1 = new User("luis", "luis@gmail.com");
        User user2 = new User("joao", "joao@gmail.com");
        user1.addGameToList(game1);
        user2.addGameToList(game2);
        game1.notifySale();
        assertEquals("Enviado para: luis@gmail.com - Olá luis, o jogo que você está de olho está em promoção - Jogo{preco=35.0, nome=Mario, duration=90 horas}", user1.getMensagem());
        assertEquals(null, user2.getMensagem());
    }
}