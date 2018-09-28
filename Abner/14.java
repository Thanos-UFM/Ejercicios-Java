package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in); //Clase Scanner, apoyado de la instancia System.in

        //Declaración de variables
        double cantidad;
        double contador =0;
        double sumatoria=0;

        do
        {
            System.out.println("Ingrese numero");
            cantidad = reader.nextInt(); //Para almacenar nos apoyamos del método nextInt()

            sumatoria += cantidad;
            contador+=1;
        } while (cantidad != 0);

        double promedio = sumatoria / (contador-1);
        System.out.println("El promedio es "+promedio);

    }
}
