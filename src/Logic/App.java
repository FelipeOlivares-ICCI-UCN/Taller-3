package Logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class App
{
    private static AppSystem s = new AppSystemImpl();

    static void main(String[] args) throws FileNotFoundException
    {
        try
        {
            readSpellFile();
            readMagicianFile();
        }

        catch (Exception e)
        {
            System.out.println("Error while reading the file: " + e.getMessage());
            return;
        }

        s.startMenu();



    }

    private static void readSpellFile() throws FileNotFoundException
    {
        File arch = new File("./data/Hechizos.txt");
        Scanner lector = new Scanner(arch);
        while (lector.hasNextLine()) {
            String[] data = lector.nextLine().split(";");
            s.loadSpellData(data);

        }
        lector.close();
    }

    private static void readMagicianFile() throws FileNotFoundException
    {
        File arch = new File("./data/Magos.txt");
        Scanner lector = new Scanner(arch);
        while (lector.hasNextLine()) {
            String[] data = lector.nextLine().split(";");
            s.loadMageData(data);
        }
        lector.close();
    }



}


