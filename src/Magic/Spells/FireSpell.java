package Magic.Spells;

public class FireSpell extends Spell {
    private int burnDuration;

    public FireSpell(String name, String type, int damage, int burnDuration) {
        super(name, type, damage);
        this.burnDuration = burnDuration;
    }

    public FireSpell(String[] data)
    {
        super(data);
        this.burnDuration = Integer.parseInt(data[3]);
    }

    @Override
    public int calculatePoints()
    {
        return super.getDamage() * this.burnDuration;

    }
}
