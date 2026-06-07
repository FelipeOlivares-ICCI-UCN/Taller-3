package Magic.Spells;

public class EarthSpell extends Spell {
    private int defenseUpgrade;

    public EarthSpell(String name, String type, int damage, int defenseUpgrade)
    {
        super(name, type, damage);
        this.defenseUpgrade = defenseUpgrade;
    }

    public EarthSpell(String[] data)
    {
        super(data);
        this.defenseUpgrade = Integer.parseInt(data[3]);

    }

    @Override
    public int getScore()
    {
        return (super.getDamage() * this.defenseUpgrade) / 2;

    }
}
