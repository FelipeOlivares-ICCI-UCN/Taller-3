package Magic;

public class FireSpell extends Spell {
    private int burnDuration;

    @Override
    public int calculatePoints()
    {
        return super.getDamage() * this.burnDuration;

    }


}
