package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in); //Clase Scanner, apoyado de la instancia System.in

        //Declaración de variables
        double z; //desviación estándar normal
        double X = 85.3; //Variable distancia
        double m = 80; //Valor medio
        double s = 4; // desviación estaándar

        z = (X-m)/s;

        System.out.println("La desviación estándar normal es de: " + z);

    }
}
