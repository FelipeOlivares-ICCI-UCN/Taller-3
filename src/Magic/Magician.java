package Magic;

import Magic.Spells.Spell;

import java.util.ArrayList;

public class Magician {
    private String name;

    private ArrayList<Spell> magicianSpells;

    public Magician(String name, ArrayList<Spell> spells)
    {
        this.name = name;
        this.magicianSpells = spells;
    }

    @Override
    public String toString() {
        return "Magician " + name + " with their spells " + getSpellsNames();
    }

    //Used only for a cleaner toString method
    private ArrayList<String> getSpellsNames()
    {
        ArrayList<String> names = new ArrayList<>();
        for (Spell spell: magicianSpells)
        {
            names.add(spell.getName());
        }
        return names;
    }
}
