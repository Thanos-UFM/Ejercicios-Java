package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner scan= new Scanner(System.in);
        System.out.print("Ingrese el primer número");
        num1=scan.nextInt();
        System.out.print("Ingrese el segundo número");
        num2=scan.nextInt();
        sum=num1+num2;
        System.out.print(sum);
    }
}
