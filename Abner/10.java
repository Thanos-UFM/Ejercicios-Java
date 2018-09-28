package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in); //Clase Scanner, apoyado de la instancia System.in

        //Declaración de variables
        int numero;
        int resultado;

                /*System.out.println("Ingrese numero");
                numero = reader.nextInt(); //Para almacenar nos apoyamos del método nextInt()*/
        for (int tabla = 1; tabla <=10; tabla++)
        {
            for (int i =1 ; i <= 10; i++)
            {
                resultado = tabla * i;

                System.out.println(tabla + " * " + i + " = " + resultado);

            }
            System.out.println(" --------------------- ");
        }

    }
}
