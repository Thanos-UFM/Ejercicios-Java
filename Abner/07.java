package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //Clase Scanner, apoyado de la instancia System.in

        //Declaración de variables
        int año;

        System.out.println("Ingrese año");
        año = reader.nextInt(); //Para almacenar nos apoyamos del método nextInt()



        if (año % 4 == 0 )
            System.out.println("Es un año bisiesto");

        else
            System.out.println("No es bisiesto");

    }
}
