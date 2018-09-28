package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //Clase Scanner, apoyado de la instancia System.in

        //Declaración de variables
        int numero1;
        int numero2;
        int suma;

        System.out.println("Ingrese el primer número");
        numero1 = reader.nextInt(); //Para almacenar nos apoyamos del método nextInt()

        System.out.println("Ingrese el segundo número");
        numero2 = reader.nextInt();

        suma = numero1 + numero2; //Se realiza la suma
        System.out.println("La suma es " +suma);  //Muestra el resultado

    }
}