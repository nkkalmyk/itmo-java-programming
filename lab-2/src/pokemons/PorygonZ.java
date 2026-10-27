package pokemons;
import ru.ifmo.se.pokemon.*;
import moves.*;

public final class PorygonZ extends Porygon2 {
    public PorygonZ(String name, int level ) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(85, 80, 70, 135, 75, 90);
        addMove(new NastyPlot());
    }
}
