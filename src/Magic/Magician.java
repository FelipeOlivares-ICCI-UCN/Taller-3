package Magic;

import java.util.ArrayList;

public class Magician {
    private String name;

    private ArrayList<Spell> magicianSpells = new ArrayList<>();

    public Magician(String name)
    {
        this.name = name;
    }

    public void addSpell(Spell newSpell)
    {
        magicianSpells.add(newSpell);
    }



}
