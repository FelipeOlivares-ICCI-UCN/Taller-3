package Logic;

import Magic.Factory.*;
import Magic.Magician.*;
import Magic.Spells.Spell;

import java.util.ArrayList;

public class AppSystemImpl implements AppSystem {

    public static ArrayList<Spell> globalSpells = new ArrayList<>();
    public static ArrayList<Magician> magiciansArray = new ArrayList<>();

    @Override
    public void startMenu()
    {
        for (Spell spell: globalSpells)
        {
            System.out.println(spell.getName());

        }
    }

    @Override
    public void loadSpellData(String[] data)
    {
        globalSpells.add(SpellFactory.getSpell(data));
    }

    @Override
    public void loadMageData(String[] data) {

    }


}
