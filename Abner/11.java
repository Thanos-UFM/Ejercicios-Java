package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in); //Clase Scanner, apoyado de la instancia System.in

        //Declaración de variables
        int numero1;
        int numero2;
        int resultado=0;

        System.out.println("Ingrese numero");
        numero1 = reader.nextInt(); //Para almacenar nos apoyamos del método nextInt()

        System.out.println("Ingrese numero");
        numero2 = reader.nextInt();


        for (int i = 1 ; i <= numero2; i++)
        {
            resultado += numero1;

            System.out.print(numero1 + " + ");

        }
        System.out.println("El resultado es "+ resultado);

    }
}
