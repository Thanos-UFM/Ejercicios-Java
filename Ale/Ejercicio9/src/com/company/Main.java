package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int num;
	String newLine = System.getProperty("line.separator");
	Scanner scan= new Scanner(System.in);
	System.out.print("Ingrese un número: ");
	num=scan.nextInt();
	for (int i=1; i<=10; i++)
    {
        int mult=i*num;
        System.out.print(num+"x"+i+"="+mult+newLine);
    }
    }
}
