package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in); //Clase Scanner, apoyado de la instancia System.in

        //Declaraci�n de variables
        int numero;
        int x;

        System.out.println("Ingrese un n�mero natural");
        numero = reader.nextInt();
        int inicial =1;

        if (numero <0)
        {
            System.out.println("El n�mero ingresado no es natural");
        }

        else
        {
            do {
                x=inicial;
                if (x%2 == 1)
                {
                    System.out.println(x);
                }
                inicial += 1;

            } while (x < numero-1);
        }

    }
}
