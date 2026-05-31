package Magic.Spells;

public class EarthSpell extends Spell {
    private int defenseUpgrade;

    public EarthSpell(String name, String type, int damage, int defenseUpgrade)
    {
        super(name, type, damage);
        this.defenseUpgrade = defenseUpgrade;
    }

    @Override
    public int calculatePoints()
    {
        return (super.getDamage() * this.defenseUpgrade) / 2;

    }
}
