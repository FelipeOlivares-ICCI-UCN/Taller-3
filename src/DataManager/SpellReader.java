package DataManager;

import Magic.Spells.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SpellReader {

    private Scanner spellScanner;

    public SpellReader()
    {
        try
        {
            this.spellScanner = new Scanner(new File("./data/Hechizos.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Cant find the Hechizos.txt file at ./data/ directory ", e);
        }
    }

    public ArrayList<Spell> readFile()
    {
        ArrayList<Spell> spellArr = new ArrayList<>();
        while (spellScanner.hasNextLine())
        {
            String data = spellScanner.nextLine();
            spellArr.add(spellParser(data));

        }

        return spellArr;
    }


    private Spell spellParser(String data)
    {
        String[] spellData = data.split(";");
        String spellName = spellData[0];
        String spellType = spellData[1];
        int spellDamage = Integer.parseInt(spellData[2]);

        if (spellType.equals("Fuego"))
        {
            int burnTime = Integer.parseInt(spellData[3]);
            return new FireSpell(spellName, spellType, spellDamage, burnTime);
        }

        else if (spellType.equals("Tierra"))
        {
            int defenseUpgrade = Integer.parseInt(spellData[3]);
            return new EarthSpell(spellName, spellType, spellDamage, defenseUpgrade);
        }

        else if (spellType.equals("Planta"))
        {
            int stunDuration = Integer.parseInt(spellData[3].split(",")[0]);
            int quantPlant = Integer.parseInt(spellData[3].split(",")[1]);

            return new PlantSpell(spellName, spellType, spellDamage, stunDuration, quantPlant);
        }

        else if (spellType.equals("Agua"))
        {
            int quantHeal = Integer.parseInt(spellData[3].split(",")[0]);
            int waterPressure = Integer.parseInt(spellData[3].split(",")[1]);

            return new WaterSpell(spellName, spellType, spellDamage, quantHeal, waterPressure);
        }

        //Only used to return something if everything else fails.
        return new Spell(spellName, spellType, spellDamage);

    }



}
