package Logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class App
{
    static Scanner sc = new Scanner(System.in);
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

        printMenu();





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

    private static void printMenu() {

        int option;
        int suboption;

        do {
            System.out.println("--------------------------------------");
            System.out.println("MENU");
            System.out.println("--------------------------------------");
            System.out.println("1) Analysis.");
            System.out.println("2) Administrate ");
            System.out.println("0) Exit.\n");

            option = selectOption(2);

            System.out.println();
            if (option == 1) {
                System.out.println("1) Show Top Ten Spells.");
                System.out.println("2) Show Top Three Wizards");
                System.out.println("3) Show all Spells ");
                System.out.println("4) Show all Wizards ");
                System.out.println("5) Show all Spells with their score");
                System.out.println("6) Show all Wizards with their score");
                System.out.println("0) Return.\n");

                suboption = selectOption(6);

                if (suboption != 0)
                {
                    s.analysisMenu(suboption);
                }


            } else if (option == 2) {
                System.out.println("--------------------------------------");
                System.out.println("ADMIN MENU");
                System.out.println("--------------------------------------");
                System.out.println("1) Add Wizard");
                System.out.println("2) Modify Wizard");
                System.out.println("3) Delete Wizard");
                System.out.println("4) Add Spell");
                System.out.println("5) Modify Spell");
                System.out.println("6) Delete Spell");
                System.out.println("0) Return.\n");


                suboption = selectOption(6);


                if (suboption != 0)
                {
                    s.adminMenu(suboption);
                }

            }

        }while (option != 0);
        System.out.println("Goodbye!");
        sc.close();
    }

    private static int selectOption(int max)
    {

        while (true)
        {
            System.out.print("ENTER: ");

            if (sc.hasNextInt())
            {

                int i = sc.nextInt();

                if (0 <= i && i <= max)
                {
                    sc.nextLine();
                    return i;
                }
            }
            sc.nextLine();
        }

    }

    private static String getNewStringValue()
    {
        System.out.print("ENTER: ");
        return sc.nextLine();

    }

}







