package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in); //Clase Scanner, apoyado de la instancia System.in

        //Declaraci�n de variables
        int numero1;

        int contador=0;

        System.out.println("Ingrese numero");
        numero1 = reader.nextInt(); //Para almacenar nos apoyamos del m�todo nextInt()




        for (int i = 1 ; i <= numero1; i++)
        {
            if (numero1 % i == 0)
            {
                contador++;
            }

        }

        if (contador <= 2)
        {
            System.out.println("Es un n�mero primo");
        }

        else
        {
            System.out.println("No es n�mero primo");
        }

    }
}
