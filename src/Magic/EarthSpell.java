package Magic;

public class EarthSpell extends Spell {
    private int defenseUpgrade;

    @Override
    public int calculatePoints()
    {
        return (super.getDamage() * this.defenseUpgrade) / 2;

    }


}
