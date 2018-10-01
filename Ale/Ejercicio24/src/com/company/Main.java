package com.company;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Ingrese su nombre completo utilizando - para separar cada uno: ");
        String nombre=scan.next();
        String [] partes;
        partes = nombre.split(Pattern.quote("-"));
        String primernombre= partes[0];
        String segundonombre= partes[1];
        String primerapellido= partes[2];
        String segundoapellido= partes[3];

        int contador1nombre = 0;
        for (int i = 0; i < primernombre.length(); i++) {
            if (Character.isLetter(primernombre.charAt(i)))
                contador1nombre++;
        }
            System.out.print("\n"+primernombre+" contiene "+contador1nombre+ " letras");


        int contador2nombre = 0;
        for (int i = 0; i < segundonombre.length(); i++) {
            if (Character.isLetter(segundonombre.charAt(i)))
                contador2nombre++;
        }
            System.out.print("\n"+segundonombre+" contiene "+contador2nombre+ " letras");


        int contador1apellido = 0;
        for (int i = 0; i < primerapellido.length(); i++) {
            if (Character.isLetter(primerapellido.charAt(i)))
                contador1apellido++;
        }
            System.out.print("\n"+primerapellido+" contiene "+contador1apellido+ " letras");


        int contador2apellido = 0;
        for (int i = 0; i < segundoapellido.length(); i++) {
            if (Character.isLetter(segundoapellido.charAt(i)))
                contador2apellido++;
        }
            System.out.print("\n"+segundoapellido+" contiene "+contador2apellido+ " letras");
    }
}
