package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in); //Clase Scanner, apoyado de la instancia System.in

        //Declaración de variables
        Double moneda25;
        Double moneda50;
        Double moneda10;
        Double moneda01;

        System.out.println("Ingrese cantidad de monedas de 50 centavos");
        moneda50 = reader.nextDouble(); //Para almacenar nos apoyamos del método nextInt()

        System.out.println("Ingrese cantidad de monedas de 25 centavos");
        moneda25 = reader.nextDouble(); //Para almacenar nos apoyamos del método nextInt()

        System.out.println("Ingrese cantidad de monedas de 10 centavos");
        moneda10 = reader.nextDouble(); //Para almacenar nos apoyamos del método nextInt()

        System.out.println("Ingrese cantidad de monedas de 1 centavo");
        moneda01 = reader.nextDouble(); //Para almacenar nos apoyamos del método nextInt()

        Double subtotal50 = moneda50 * 0.5;
        Double subtotal25 = moneda25 *0.25;
        Double subtotal10 = moneda10 * 0.10;
        Double subtotal01 = moneda01 * 0.01;

        Double total = subtotal01 + subtotal10 + subtotal25 + subtotal50;
        System.out.println("El total de las monedas es Q." + total);

    }
}
