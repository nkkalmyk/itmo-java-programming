package moves;
import ru.ifmo.se.pokemon.*;

public final class DefenceCurl extends StatusMove {
    public DefenceCurl(){
        super(Type.NORMAL, 0, 1);
    }
    @Override
    protected  void applySelfEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, 1);
    }
    @Override
    protected  String describe() {
        return "использует Defence Curl";
    }}