package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //Clase Scanner, apoyado de la instancia System.in

        //Declaración de variables
        int cantidad;

        System.out.println("Ingrese numero");
        cantidad = reader.nextInt(); //Para almacenar nos apoyamos del método nextInt()



        if (cantidad%2 == 1)
        {
            System.out.println("El número es impar");
        }

        else
        {
            System.out.println("El número es par");
        }

    }
}
