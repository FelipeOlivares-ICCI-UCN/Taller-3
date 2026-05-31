package Magic.Spells;

public class WaterSpell extends Spell {
    private int quantHeal;
    private int waterPressure;

    public WaterSpell(String name, String type, int damage, int quantHeal, int waterPressure) {
        super(name, type, damage);
        this.quantHeal = quantHeal;
        this.waterPressure = waterPressure;
    }
    public WaterSpell(String[] data)
    {
        super(data);
        this.quantHeal = Integer.parseInt(data[3].split(",")[0]);
        this.waterPressure = Integer.parseInt(data[3].split(",")[1]);
    }

    @Override
    public int calculatePoints()
    {
        return (super.getDamage() + this.quantHeal + this.waterPressure) * 2;
    }
}
