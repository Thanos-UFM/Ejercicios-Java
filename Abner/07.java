package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); //Clase Scanner, apoyado de la instancia System.in

        //Declaraci�n de variables
        int a�o;

        System.out.println("Ingrese a�o");
        a�o = reader.nextInt(); //Para almacenar nos apoyamos del m�todo nextInt()



        if (a�o % 4 == 0 )
            System.out.println("Es un a�o bisiesto");

        else
            System.out.println("No es bisiesto");

    }
}
