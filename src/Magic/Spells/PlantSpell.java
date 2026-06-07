package Magic.Spells;

public class PlantSpell extends Spell {
    private int stunDuration;
    private int quantPlants;

    public PlantSpell(String name, String type, int damage, int stunDuration, int quantPlants) {
        super(name, type, damage);
        this.stunDuration = stunDuration;
        this.quantPlants = quantPlants;
    }

    public PlantSpell(String[] data)
    {
        super(data);
        this.stunDuration = Integer.parseInt(data[3].split(",")[0]);
        this.quantPlants = Integer.parseInt(data[3].split(",")[1]);
    }

    @Override
    public int getScore()
    {
        return super.getDamage() + (this.stunDuration + this.quantPlants);

    }
}
