package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
            throws IOException
    {
	// write your code here
        Scanner textfile = new Scanner(new File("test.txt"));

        Double sum = 0.0;

        while(textfile.hasNext()){
            String text = textfile.next();
            System.out.println(text);

            while(textfile.hasNextDouble()) {
                Double nextDouble = textfile.nextDouble();
                System.out.println(nextDouble);
                sum += nextDouble;
            }
        }

        Double promedio = sum/3;

        System.out.println("El promedio de las notas es: " + promedio);

    }
}
