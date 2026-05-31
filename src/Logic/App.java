package Logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App
{
    private static void readSpellFile() throws FileNotFoundException
    {
        File arch = new File("./data/Hechizos.txt");
        Scanner lector = new Scanner(arch);
        while (lector.hasNextLine()) {
            String[] data = lector.nextLine().split(";");
        }
        lector.close();
    }

    private static void readMagicianFile() throws FileNotFoundException
    {
        File arch = new File("./data/Magos.txt");
        Scanner lector = new Scanner(arch);
        while (lector.hasNextLine()) {
            String[] data = lector.nextLine().split(";");
        }
        lector.close();
    }



}


