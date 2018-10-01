package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        System.out.print("Ingrese un número");
        Scanner scan= new Scanner(System.in);
        num=scan.nextInt();
        if(num==7){
            System.out.print("Número de la suerte");
        }
    }
}
