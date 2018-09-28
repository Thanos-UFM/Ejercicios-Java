package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //Clase Scanner, apoyado de la instancia System.in

        //Declaración de variables
        int numero1;

        System.out.println("Ingrese el número");
        numero1 = reader.nextInt(); //Para almacenar nos apoyamos del método nextInt()



        if (numero1 >= 20 && numero1 <=100 )
            System.out.println("El número está en el rango 20 a 100");

        else
            System.out.println("No está en el rango");

    }
}
