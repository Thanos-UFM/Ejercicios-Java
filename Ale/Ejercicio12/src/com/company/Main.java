package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int num;
	boolean prime=true;
	Scanner scan= new Scanner(System.in);
	System.out.print("Ingrese un número");
	num= scan.nextInt();
	if (num>1)
    {
        for (int i = 2; i*i <= num; i++)
        {
            if (num % i == 0)
            {
                prime=false;
            }
            else
            {
                prime=true;
            }
        }
    }
    if(prime)
    {
        System.out.print("Es primo");
    }
    }
}
