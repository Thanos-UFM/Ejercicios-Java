package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	float pfut, pbeis, prebajaf, prebajab;
	Scanner scan= new Scanner(System.in);
	System.out.print("Ingrese el precio de las pelotas de Futbol: ");
	pfut=scan.nextFloat();
	prebajaf=(pfut*75)/100;
	System.out.print("Ingrese el precio de las pelotas de Beisbol: ");
	pbeis=scan.nextFloat();
	prebajab=(pbeis*75)/100;
	System.out.print("\nPelotas de Futbol: \nOriginal: "+pfut+"\nCon descuento: "+prebajaf);
	System.out.print("\nPelotas de Beisbol: \nOriginal: "+pbeis+"\nCon descuento: "+prebajab);
    }
}
