package Magic;

public class WaterSpell extends Spell {
    private int quantHeal;
    private int waterPressure;

    @Override
    public int calculatePoints()
    {
        return (super.getDamage() + this.quantHeal + this.waterPressure) * 2;

    }


}
