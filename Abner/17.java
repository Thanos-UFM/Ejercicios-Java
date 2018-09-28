package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in); //Clase Scanner, apoyado de la instancia System.in

        //Declaración de variables
        double precio1;
        double descuento = 0.25;
        double nuevoprecio;

        System.out.println("Ingrese precio normal de la pelota");
        precio1 = reader.nextInt(); //Para almacenar nos apoyamos del método nextInt()

        nuevoprecio = precio1 - (precio1*descuento);

        System.out.println("Precio normal: " + precio1);
        System.out.println("Precio con descuento aplicado: " + nuevoprecio);

    }
}
