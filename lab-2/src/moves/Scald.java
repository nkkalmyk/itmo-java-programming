package moves;

import ru.ifmo.se.pokemon.*;

public final class Scald extends SpecialMove {
    public Scald(){
        super(Type.WATER, 80, 1);
    }
    @Override
    protected  void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.3)
            Effect.burn(p);
    }
    @Override
    protected  String describe() {
        return "использует Scald";
    }


}