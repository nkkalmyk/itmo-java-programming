import ru.ifmo.se.pokemon.*;
import pokemons.*;
import moves.*;

public class lab2 {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Porygon("Пиксель", 1);
        Pokemon p2 = new Torkoal("Кочегар", 38);
        Pokemon p3 = new Wimpod("Шмыг", 1);

        Pokemon p4 = new Golisopod("Броненосец", 30);
        Pokemon p5 = new Porygon2("Пиксель 2", 1);
        Pokemon p6 = new PorygonZ("ПиксельSUPER", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();

    }

}
