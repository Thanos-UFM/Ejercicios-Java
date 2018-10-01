package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String newLine = System.getProperty("line.separator");
        Scanner scan= new Scanner(System.in);
        for (int i=1;i<=10;i++)
        {
            for (int j=1; j<=10; j++)
            {
                System.out.print(i+"x"+j+"="+(i*j));
                System.out.print(newLine);
            }
        }
    }
}
