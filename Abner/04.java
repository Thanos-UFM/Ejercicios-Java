package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //Clase Scanner, apoyado de la instancia System.in

        //Declaración de variables
        int numero1;
        int numero2;

        System.out.println("Ingrese el primer número");
        numero1 = reader.nextInt(); //Para almacenar nos apoyamos del método nextInt()

        System.out.println("Ingrese el segundo número");
        numero2 = reader.nextInt();

        if (numero1 > numero2)
            System.out.println("Número " + numero1 + " es el número mayor");

        else
            System.out.println("Número " + numero2 + " es el número mayor");

    }
}
