package Logic;

import Magic.Factory.*;
import Magic.Magician.*;
import Magic.Spells.Spell;

import java.util.ArrayList;

public class AppSystemImpl implements AppSystem {

    public static ArrayList<Spell> globalSpells = new ArrayList<>();
    public static ArrayList<Magician> magiciansArray = new ArrayList<>();

    @Override
    public void adminMenu(int option)
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
        String name = data[0];
        String[] spellNames = data[1].split("\\|");

        Magician magician = new Magician(name);

        for (int i = 1; i < spellNames.length; i++) {
            String spellName = spellNames[i];

            for (Spell spell : globalSpells) {
                if (spell.getName().equals(spellName)) {
                    magician.addSpell(spell);
                    break;
                }
            }
        }

        magiciansArray.add(magician);
    }
}