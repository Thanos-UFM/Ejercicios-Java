package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Double uno, diez, veinticinco, cincuenta, total;
	Scanner scan= new Scanner(System.in);
	System.out.print("Ingrese cuantas monedas tiene de ¢1: ");
	uno=scan.nextDouble();
	System.out.print("Ingrese cuantas monedas tiene de ¢10: ");
	diez=scan.nextDouble();
	System.out.print("Ingrese cuantas monedas tiene de ¢25: ");
	veinticinco=scan.nextDouble();
	System.out.print("Ingrese cuantas monedas tiene de ¢50: ");
	cincuenta=scan.nextDouble();
	total=(0.01*uno)+(0.1*diez)+(0.25*veinticinco)+(0.5*cincuenta);
	System.out.print("Q."+total);
    }
}
