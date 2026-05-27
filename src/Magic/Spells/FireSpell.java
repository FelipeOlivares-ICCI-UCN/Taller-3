package Magic.Spells;

public class FireSpell extends Spell {
    private int burnDuration;

    public FireSpell(String name, String type, int damage, int burnDuration) {
        super(name, type, damage);
        this.burnDuration = burnDuration;
    }

    @Override
    public int calculatePoints()
    {
        return super.getDamage() * this.burnDuration;

    }

    @Override
    public String toString() {
        return super.toString() + ", Burn duration : " + this.burnDuration;
    }


}
