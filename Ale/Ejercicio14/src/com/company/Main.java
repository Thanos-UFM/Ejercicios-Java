package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int num;
	Scanner scan= new Scanner(System.in);
	System.out.print("Ingrese un número; ");
	num=scan.nextInt();
	for (int i=1;i<=num*2;i++)
    {
        if (i%2 !=0)
        {
            System.out.print(i+",");
        }
    }
    }
}
