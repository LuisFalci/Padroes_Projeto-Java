import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Character character = new Character("Fat", new Hat("Red","A",1.26), "Black", 12, 621.67, 32.2);

        Character characterClone = character.clone();
        characterClone.setAge(43);
        characterClone.setBody("Slim");
        characterClone.setHeight(83.5);
        characterClone.getHat().setColor("Blue");

        //Character Original
        assertEquals("Character{body='Fat', hat=Hat{color='Red', model='A', size=1.26}, skin='Black', age=12, height=621.67, weight=32.2}", character.toString());

        //Character Original
        assertEquals("Character{body='Slim', hat=Hat{color='Blue', model='A', size=1.26}, skin='Black', age=43, height=83.5, weight=32.2}", characterClone.toString());
    }
}