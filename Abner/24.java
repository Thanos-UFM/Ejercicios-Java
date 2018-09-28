package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner reader = new Scanner(System.in); //Clase Scanner, apoyado de la instancia System.in
        String nombre;

        nombre = "Abner Xocop";
        String[] separadas = nombre.split(" ");

        for (String foobar : separadas ){
            System.out.print(String.format("<%s>", foobar));
            System.out.print(" Contiene: " );
            System.out.print(foobar.length());
            System.out.println(" letras" );
        }

    }
}
