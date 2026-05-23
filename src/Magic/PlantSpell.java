package Magic;

public class PlantSpell extends Spell {
    private int stunDuration;
    private int quantPlants;

    @Override
    public int calculatePoints()
    {
        return super.getDamage() + (this.stunDuration + this.quantPlants);

    }


}
