package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numnum, num, num2, sum=0, cont=1;
        Scanner scan= new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        num=scan.nextInt();
        numnum=num;
        sum=num;
        System.out.print("Ingrese el segundo número: ");
        num2=scan.nextInt();
        System.out.print(num+"x"+num2+"="+numnum);
        while (cont<num2)
        {
            sum+=num;
            System.out.print("+"+numnum);
            cont++;
        }
        System.out.print("="+sum);
    }
}
