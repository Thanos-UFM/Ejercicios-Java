package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in); //Clase Scanner, apoyado de la instancia System.in

        //Declaración de variables
        int numero1;
        int numero2;

        System.out.println("Ingrese numero");
        numero1 = reader.nextInt(); //Para almacenar nos apoyamos del método nextInt()

        System.out.println("Ingrese numero");
        numero2 = reader.nextInt(); //Para almacenar nos apoyamos del método nextInt()

        if (numero1 > numero2)
        {
            System.out.println(numero1 + " es mayor que " + numero2);
            System.out.println(numero2 + " es menor que " + numero1);
            System.out.println(numero2 + " no es igual que " + numero1);
        }

        if (numero2 > numero1)
        {
            System.out.println(numero2 + " es mayor que " + numero1);
            System.out.println(numero1 + " es menor que " + numero2);
            System.out.println(numero2 + " no es igual que " + numero1);
        }

        if (numero1 == numero2)
        {
            System.out.println(numero2 + " no es mayor que " + numero1);
            System.out.println(numero1 + " no es menor que " + numero2);
            System.out.println(numero1 + " es igual a " + numero2);
        }

    }
}
