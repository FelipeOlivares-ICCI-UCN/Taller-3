package Magic.Magician;

import Magic.Spells.Spell;

import java.util.ArrayList;

public class Magician {
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

}
