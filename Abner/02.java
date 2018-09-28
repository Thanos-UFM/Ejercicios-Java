package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //Clase Scanner, apoyado de la instancia System.in

        //Declaración de variables
        int numero;


        System.out.println("Ingrese el  número");
        numero = reader.nextInt(); //Para almacenar nos apoyamos del método nextInt()


        if (numero == 7)
        {
            System.out.println("Número de la suerte");
        }

        else
            System.out.println("No es 7");

    }
}
