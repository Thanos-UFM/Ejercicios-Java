package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int suma;
        int dado=0;
        int opcion;
        Scanner scan= new Scanner(System.in);
        while(dado<3) {
            System.out.print("Presione 1 para lanzar el dado");
            opcion=scan.nextInt();
            dado++;
        }
        int primero= (int) (Math.random() * 6) + 1;
        int segundo= (int) (Math.random() * 6) + 1;
        int tercero= (int) (Math.random() * 6) + 1;
        suma=primero+segundo+tercero;
        System.out.print("\nPrimer lanzamiento: "+primero+"\nSegundo lanzamiento: "+segundo+"\nTercer lanzamiento: "+tercero+"\nTotal: "+suma);
    }
}
