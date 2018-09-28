package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in); //Clase Scanner, apoyado de la instancia System.in

        //Declaración de variables
        int cantidad;

        int contador=0;

        System.out.println("Ingrese numero");
        cantidad = reader.nextInt(); //Para almacenar nos apoyamos del método nextInt()

        int numero = 1;

        for (int i = 1 ; i <= cantidad; i++)
        {

            if (numero%2 == 1)
            {
                System.out.println(numero);
            }

            numero+=2;

        }

    }
}
