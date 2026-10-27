package pokemons;
import ru.ifmo.se.pokemon.*;
import moves.*;
public final class Golisopod extends Wimpod{
    public Golisopod(String name, int level) {
        super(name, level);
        setType(Type.BUG, Type.WATER);
        setStats(75, 125, 140, 60, 90, 40);
        addMove(new FocusBlast());
    }
}
