package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int num, num2, factorial;
	factorial=1;
	Scanner scan= new Scanner(System.in);
	System.out.print("Ingrese un número");
	num=scan.nextInt();
	for (num2=1;num2<=num; num2++)
    {
        factorial=factorial*num2;
    }
    System.out.print(factorial);
    }
}
