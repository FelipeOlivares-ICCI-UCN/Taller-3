package Logic;

import Magic.Factory.*;
import Magic.Magician.*;
import Magic.Scored;
import Magic.Spells.Spell;

import java.util.ArrayList;


public class AppSystemImpl implements AppSystem {

    public static ArrayList<Spell> globalSpells = new ArrayList<>();
    public static ArrayList<Magician> magiciansArray = new ArrayList<>();


    @Override
    public void adminMenu(int option)
    {
        quickSort(globalSpells, 0, globalSpells.size() - 1);
        quickSort(magiciansArray, 0, magiciansArray.size() - 1);

        System.out.println("Option " + option + " yet TBA");

    }

    @Override
    public void analysisMenu(int option) {

        quickSort(globalSpells, 0, globalSpells.size() - 1);
        quickSort(magiciansArray, 0, magiciansArray.size() - 1);

        if (option == 1)
        {
            printTopSpells();
        }

        if (option == 2)
        {
            printTopWizards();
        }

        if (option == 3)
        {
            printAllSpells(false);
        }
        if (option == 4)
        {
            printAllWizards(false);
        }
        if (option == 5)
        {
            printAllSpells(true);
        }
        if (option == 6)
        {
            printAllWizards(true);
        }




    }

    @Override
    public void loadSpellData(String[] data) {
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

    public <T extends Scored> void quickSort(ArrayList<T> list, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(list, low, high);

            quickSort(list, low, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, high);
        }
    }

    private <T extends Scored> int partition(ArrayList<T> list, int low, int high) {
        int pivot = list.get(high).getScore();

        int i = low - 1;

        for (int j = low; j < high; j++) {
            // Descending order
            if (list.get(j).getScore() >= pivot) {
                i++;
                swap(list, i, j);
            }
        }

        swap(list, i + 1, high);
        return i + 1;
    }



    private  <T extends Scored> void swap(ArrayList<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    private void printTopSpells()
    {
        if (globalSpells.isEmpty()) {
            System.out.println("No spells available.");
            return;
        }

        if (globalSpells.size() > 10)
        {
            for (int i = 0; i < 10; i++)
            {
                System.out.println((i + 1) + ") " + globalSpells.get(i));
            }

        }

        else
        {
            int i = 1;
            for (Spell spell : globalSpells)
            {
                System.out.println(i + ")" + spell);
                i++;
            }
        }


    }


    private void printTopWizards()
    {
        if (magiciansArray.isEmpty()) {
            System.out.println("No wizard available.");
            return;
        }

        if (magiciansArray.size() > 3)
        {
            for (int i = 0; i < 3; i++)
            {
                System.out.println((i + 1) + ") " + magiciansArray.get(i));
            }

        }

        else
        {
            int i = 1;
            for (Magician wizard : magiciansArray)
            {
                System.out.println(i + ")" + wizard);
                i++;
            }
        }

    }

    private void printAllSpells(boolean shouldPrintScore)
    {
        if (globalSpells.isEmpty()) {
            System.out.println("No spells available.");
            return;
        }

        int i = 1;
        for (Spell spell : globalSpells)
        {
            if (shouldPrintScore)
            {
                System.out.println(i + ") " + spell + " - " + spell.getScore());
            }
            else
            {
                System.out.println(i + ") " + spell);
            }
        }

    }

    private void printAllWizards(boolean shouldPrintScore)
    {
        if (magiciansArray.isEmpty()) {
            System.out.println("No wizard available.");
            return;
        }

        int i = 1;
        for (Magician wizard : magiciansArray)
        {
            if (shouldPrintScore)
            {
                System.out.println(i + ") " + wizard + " - " + wizard.getScore());
            }
            else
            {
                System.out.println(i + ") " + wizard);
            }
            i++;
        }
    }



}

