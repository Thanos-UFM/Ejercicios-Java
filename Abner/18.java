package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in); //Clase Scanner, apoyado de la instancia System.in

        //Declaraci�n de variables
        double z; //desviaci�n est�ndar normal
        double X = 85.3; //Variable distancia
        double m = 80; //Valor medio
        double s = 4; // desviaci�n esta�ndar

        z = (X-m)/s;

        System.out.println("La desviaci�n est�ndar normal es de: " + z);

    }
}
