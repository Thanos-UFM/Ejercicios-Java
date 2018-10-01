package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int num1, num2;
	Scanner scan= new Scanner(System.in);
	System.out.print("Ingrese dos números \n");
	num1=scan.nextInt();
	num2=scan.nextInt();
	if (num1>num2)
    {
        System.out.print(num1+" es mayor que "+num2);
    }
    else if(num2>num1)
    {
        System.out.print(num1+" es menor que "+num2);
    }
    else
    {
        System.out.print(num1+" es igual que "+num2);
    }
    }
}
