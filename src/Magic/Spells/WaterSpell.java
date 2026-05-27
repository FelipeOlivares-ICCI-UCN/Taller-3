package Magic.Spells;

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



    @Override
    public String toString() {
        return super.toString() + ", Life healed: " + this.quantHeal
                + ", Water Pressure: " + this.waterPressure ;
    }

}
