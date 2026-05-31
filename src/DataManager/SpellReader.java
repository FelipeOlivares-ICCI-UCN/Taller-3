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
            String[] data = spellScanner.nextLine().split(";");
            spellArr.add(SpellFactory.getSpell(data));

        }

        return spellArr;
    }





}
