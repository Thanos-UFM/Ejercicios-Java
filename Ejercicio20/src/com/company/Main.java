package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int num1, num2, num3, resultado=0;
	Scanner scan= new Scanner(System.in);
	num1=scan.nextInt();
	num2=scan.nextInt();
	num3=num1+num2;
	while (num3>num2)
    {
        num3=num3-num2;
        resultado+=1;
    }
    System.out.print(resultado);
    }
}
