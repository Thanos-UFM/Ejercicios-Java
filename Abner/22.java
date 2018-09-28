package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;

        Random rand = new Random();
        for(int i = 0; i < 3; i++) {
            int randomNum = rand.nextInt(6 - 1 + 1) + 1;
            System.out.println("Primer lanzamiento: " + randomNum);
            sum += randomNum;

        }

        int promedio = sum/3;
        System.out.println("El promedio de los lanzamientos es: " + promedio);

    }
}
