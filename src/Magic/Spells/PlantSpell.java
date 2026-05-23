package Magic.Spells;

public class PlantSpell extends Spell {
    private int stunDuration;
    private int quantPlants;

    public PlantSpell(String name, String type, int damage, int stunDuration, int quantPlants) {
        super(name, type, damage);
        this.stunDuration = stunDuration;
        this.quantPlants = quantPlants;
    }

    @Override
    public int calculatePoints()
    {
        return super.getDamage() + (this.stunDuration + this.quantPlants);

    }


}
