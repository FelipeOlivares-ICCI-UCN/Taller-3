package DataManager;

import Magic.Spells.Spell;
import java.util.ArrayList;

public class SpellCompendium
{
    private ArrayList<Spell> compendium;

    public SpellCompendium(ArrayList<Spell> data)
    {
        this.compendium = data;
    }

    public void printCompendium()
    {
        for (Spell spell: compendium)
        {
            System.out.println(spell.getName());
        }
    }
}
