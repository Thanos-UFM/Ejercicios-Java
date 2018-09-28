package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in); //Clase Scanner, apoyado de la instancia System.in

        //Declaración de variables
        int divisor;
        int dividendo;
        int cociente=0;

        System.out.println("Ingrese el dividendo");
        dividendo= reader.nextInt();

        System.out.println("Ingrese el divisor");
        divisor = reader.nextInt();


        while (dividendo >= divisor)
        {
            dividendo = dividendo - divisor;
            cociente+=1;
        }

        System.out.println("El cociente es " +cociente);
        System.out.println("El residuo es " +dividendo);

    }
}
