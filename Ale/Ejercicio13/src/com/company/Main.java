package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int num, sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un número");
        num=scan.nextInt();
        for (int i=0; i<=num;i++)
        {
            sum+=i;
        }
        System.out.print(sum);
    }
}
