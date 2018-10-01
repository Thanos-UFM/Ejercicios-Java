package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int num;
	Scanner scan= new Scanner(System.in);
	num=scan.nextInt();
	for (int i=1; i<num; i++ )
    {
        if (i%2 !=0)
        {
            System.out.print(i+"\n");
        }
    }
    }
}
