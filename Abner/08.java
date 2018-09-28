package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //Clase Scanner, apoyado de la instancia System.in

        //Declaración de variables
        int numero;
        int factorial = 1;

        System.out.println("Ingrese numero");
        numero = reader.nextInt(); //Para almacenar nos apoyamos del método nextInt()

        for (int i =1 ; i <= numero; i++)
        {
            factorial = factorial *i;
        }

        System.out.println("El factorial del número es " + factorial);

    }
}
