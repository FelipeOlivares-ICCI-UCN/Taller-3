package Magic;

public class Spell {
    private String name;
    private String type;
    private int damage;

    public int calculatePoints()
    {
        return 0;

    }

    public int getDamage()
    {
        return this.damage;
    }

    public Spell(String name, String type, int damage)
    {
        this.name = name;
        this.type = type;
        this.damage = damage;
    }
}
