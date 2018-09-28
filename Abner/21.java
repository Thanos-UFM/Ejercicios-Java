package com.company;

public class Main {

    public static void printInitials(String name)
    {
        if (name.length() == 0)
            return;

        // Since touuper() returns int,
        // we do typecasting
        /*System.out.println(Character.toUpperCase(name.charAt(0)));*/

        letters(name.charAt(0));




        // Traverse rest of the string and
        // print the characters after spaces.
        for (int i = 1; i < name.length() - 1; i++)
        {
            if (name.charAt(i) == ' ')
                /*System.out.print(Character.toUpperCase(name.charAt(i + 1)));*/
                letters(name.charAt(i+1));
        }


    }


    public static void main(String[] args) {
        String name = "Midman Qazoo";
        printInitials(name);

    }

    public static  void letters (char letra)
    {
        if (letra == 'A')
        {
            System.out.println("*****");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*****");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println(" ");
        }

        if (letra == 'B')
        {
            System.out.println("*****");
            System.out.println("*   *");
            System.out.println("*  *");
            System.out.println("****");
            System.out.println("*  *");
            System.out.println("*   *");
            System.out.println("*****");
            System.out.println(" ");
        }

        if (letra == 'C')
        {
            System.out.println("*****");
            System.out.println("*   ");
            System.out.println("*   ");
            System.out.println("*    ");
            System.out.println("*   ");
            System.out.println("*   ");
            System.out.println("*****");
            System.out.println(" ");
        }

        if (letra == 'D')
        {
            System.out.println("****");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("****");
            System.out.println(" ");
        }

        if (letra == 'E')
        {
            System.out.println("*****");
            System.out.println("*   ");
            System.out.println("*   ");
            System.out.println("****");
            System.out.println("*   ");
            System.out.println("*   ");
            System.out.println("*****");
            System.out.println(" ");
        }

        if (letra == 'F')
        {
            System.out.println("*****");
            System.out.println("*   ");
            System.out.println("*   ");
            System.out.println("****");
            System.out.println("*   ");
            System.out.println("*   ");
            System.out.println("*");
            System.out.println(" ");
        }

        if (letra == 'G')
        {
            System.out.println("*****");
            System.out.println("*   ");
            System.out.println("*   ");
            System.out.println("* ***");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*****");
            System.out.println(" ");
        }

        if (letra == 'H')
        {
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*****");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println(" ");
        }

        if (letra == 'I')
        {
            System.out.println("*****");
            System.out.println("  *  ");
            System.out.println("  *  ");
            System.out.println("  *  ");
            System.out.println("  *  ");
            System.out.println("  *  ");
            System.out.println("*****");
            System.out.println(" ");
        }

        if (letra == 'J')
        {
            System.out.println("*****");
            System.out.println("    *");
            System.out.println("    *");
            System.out.println("    *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*****");
            System.out.println(" ");
        }

        if (letra == 'K')
        {
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*  *");
            System.out.println("***");
            System.out.println("*  *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println(" ");
        }

        if (letra == 'L')
        {
            System.out.println("*    ");
            System.out.println("*   ");
            System.out.println("*   ");
            System.out.println("*    ");
            System.out.println("*   ");
            System.out.println("*   ");
            System.out.println("*****");
            System.out.println(" ");
        }

        if (letra == 'M')
        {
            System.out.println("*   *");
            System.out.println("** **");
            System.out.println("** **");
            System.out.println("* * *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println(" ");
        }

        if (letra == 'N')
        {
            System.out.println("*   *");
            System.out.println("**  *");
            System.out.println("**  *");
            System.out.println("* * *");
            System.out.println("* * *");
            System.out.println("*  **");
            System.out.println("*   *");
            System.out.println(" ");
        }

        if (letra == 'O')
        {
            System.out.println("*****");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*****");
            System.out.println(" ");
        }

        if (letra == 'P')
        {
            System.out.println("*****");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*****");
            System.out.println("*    ");
            System.out.println("*    ");
            System.out.println("*    ");
            System.out.println(" ");
        }

        if (letra == 'Q')
        {
            System.out.println("*****");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("* * *");
            System.out.println("*  **");
            System.out.println("*****");
            System.out.println(" ");
        }

        if (letra == 'R')
        {
            System.out.println("*****");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*****");
            System.out.println("* *  ");
            System.out.println("*  * ");
            System.out.println("*   *");
            System.out.println(" ");
        }

        if (letra == 'S')
        {
            System.out.println("*****");
            System.out.println("*    ");
            System.out.println("*    ");
            System.out.println("*****");
            System.out.println("    *");
            System.out.println("    *");
            System.out.println("*****");
            System.out.println(" ");
        }

        if (letra == 'T') {
            System.out.println("*****");
            System.out.println("  *  ");
            System.out.println("  *  ");
            System.out.println("  *  ");
            System.out.println("  *  ");
            System.out.println("  *  ");
            System.out.println("  *  ");
            System.out.println(" ");
        }

        if (letra == 'U')
        {
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*****");
            System.out.println(" ");
        }

        if (letra == 'V')
        {
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println(" * * ");
            System.out.println("  *  ");
            System.out.println(" ");
        }

        if (letra == 'W')
        {
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("* * *");
            System.out.println("** **");
            System.out.println("*   *");
            System.out.println(" ");
        }

        if (letra == 'X')
        {
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println(" * * ");
            System.out.println("  *  ");
            System.out.println(" * * ");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println(" ");
        }

        if (letra == 'Y')
        {
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println(" * * ");
            System.out.println("  *  ");
            System.out.println("  *  ");
            System.out.println("  *  ");
            System.out.println("  *  ");
            System.out.println(" ");
        }

        if (letra == 'Z')
        {
            System.out.println("*****");
            System.out.println("    *");
            System.out.println("   * ");
            System.out.println("  *  ");
            System.out.println(" *   ");
            System.out.println("*    ");
            System.out.println("*****");
            System.out.println(" ");
        }

    }

}
