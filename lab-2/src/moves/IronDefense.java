package moves;
import ru.ifmo.se.pokemon.*;

public final class IronDefense extends StatusMove {
    public IronDefense(){
        super(Type.STEEL, 0, 1);
    }
    @Override
    protected  void applySelfEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, 2);
    }
    @Override
    protected  String describe() {
        return "использует Iron Defence";
    }}