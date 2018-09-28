package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in); //Clase Scanner, apoyado de la instancia System.in

        //Declaración de variables
        int numero;
        int resultado;

        System.out.println("Ingrese numero");
        numero = reader.nextInt(); //Para almacenar nos apoyamos del método nextInt()

        for (int i =1 ; i <= 10; i++)
        {
            resultado = numero * i;

            System.out.println(numero + " * " + i + " = " + resultado);

        }

    }
}
