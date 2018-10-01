package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float num=1, suma=0, contador=0,promedio=0 ;
        Scanner scan= new Scanner(System.in);
        System.out.print("Ingrese cuantos número quiera, para terminar presione 0"+"\n");
        while (num!=0){
            num=scan.nextInt();
            suma=suma+num;
            if(num!=0) {
                contador += 1;
            }
        }
        promedio=suma/contador;
        System.out.print(promedio);
    }
}
