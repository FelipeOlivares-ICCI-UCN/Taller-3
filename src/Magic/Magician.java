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

    public void addSpell(Spell newSpell)
    {
        magicianSpells.add(newSpell);
    }



}
