package pokemons;
import ru.ifmo.se.pokemon.*;
import moves.*;

public class Wimpod extends Pokemon {
    public Wimpod(String name, int level) {
        super(name, level);
        setType(Type.BUG, Type.WATER);
        setStats(25, 35, 40, 20, 30, 80);
        setMove(new Confide());
        setMove(new Scald());
        setMove(new Waterfall());
    }

}