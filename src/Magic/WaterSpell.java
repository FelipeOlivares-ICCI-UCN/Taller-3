package Magic;

public class WaterSpell extends Spell {
    private int quantHeal;
    private int waterPressure;

    public WaterSpell(String name, String type, int damage, int quantHeal, int waterPressure) {
        super(name, type, damage);
        this.quantHeal = quantHeal;
        this.waterPressure = waterPressure;
    }

    @Override
    public int calculatePoints()
    {
        return (super.getDamage() + this.quantHeal + this.waterPressure) * 2;
    }


}
