package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int num;
	Scanner scan= new Scanner(System.in);
	System.out.print("Ingrese un número: ");
	num=scan.nextInt();
	if ((num&2)==0){
	    System.out.print("El número es par");
    }
    else {
        System.out.print("El número es impar");
    }
    }
}
