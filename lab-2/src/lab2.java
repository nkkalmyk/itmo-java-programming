import ru.ifmo.se.pokemon.*;
import pokemons.*;
import moves.*;

public class lab2 {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Porygon("Чужой", 1);
        Pokemon p2 = new Porygon("Хищник", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();

    }

}
