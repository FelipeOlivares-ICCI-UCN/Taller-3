package Magic.Spells;

import Magic.Scored;

import java.util.Objects;

public abstract class Spell implements Scored {
    private String name;
    private String type;
    private int damage;

    public int getScore()
    {
        return 0;

    }

    public String getName()
    {
        return this.name;
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

    public Spell(String[] data)
    {
        this.name = data[0];
        this.type = data[1];
        this.damage = Integer.parseInt(data[2]);
    }

    @Override
    public String toString() {
        return "Spell: " + name +
                ", Type: " + type +
                ", Damage: " + damage;
    }
}
