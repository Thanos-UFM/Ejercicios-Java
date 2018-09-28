package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in); //Clase Scanner, apoyado de la instancia System.in

        //Declaración de variables
        int numero1;

        int contador=0;

        System.out.println("Ingrese numero");
        numero1 = reader.nextInt(); //Para almacenar nos apoyamos del método nextInt()




        for (int i = 1 ; i <= numero1; i++)
        {
            contador += i;
            System.out.print(" + " + i);

        }
        System.out.println("\n");

        System.out.println(" La suma es " + contador);

    }
}
