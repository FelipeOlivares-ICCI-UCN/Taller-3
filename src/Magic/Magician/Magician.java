package Magic.Magician;

import Magic.Scored;
import Magic.Spells.Spell;

import java.util.ArrayList;

public class Magician implements Scored {
    private String name;
    private ArrayList<Spell> wizardSpells = new ArrayList<>();


    public Magician(String[] data)
    {
        this.name = data[0];


    }

    public Magician(String name)
    {
        this.name = name;
    }


    public void addSpell(Spell spell)
    {
        wizardSpells.add(spell);
    }

    public String getName()
    {
        return this.name;
    }

    @Override
    public String toString()
    {
        return "Wizard '" + this.name + "'";
    }

    public int getScore()
    {
        int i = 0;
        for (Spell sp: wizardSpells)
        {
            i += sp.getScore();

        }
        return i;
    }
}
