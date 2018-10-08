import java.io.*;
import java.util.Scanner;

public class Factorial{
    
    private static final String FILENAME = "output.txt";
    
    private int fact(int num) {
        if (num <= 1)
            return num;
        System.out.println(num);
        return fact(num-1) * num;
    }
    
    
    
     public static void main(String []args){
        BufferedReader br = null;
		FileReader fr = null;
         
        System.out.println("Ingrese un numero:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        Factorial obj=new Factorial();
        System.out.println("The factorial of \'"+num+"\' is \'"+obj.fact(num)+"\'");
     }
}
