package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int year;
	Scanner scan= new Scanner(System.in);
	System.out.print("Ingrese un año: ");
	year=scan.nextInt();
	if ((year%4)==0){
	    System.out.print("El año es bisiesto");
    }
    }
}
