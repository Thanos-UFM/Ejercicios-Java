import java.io.*;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Factorial{
    
    private static final String FILENAME = "output.txt";
    
    private static void fact(int num) {
    	int i = 0;
	    Integer factorial = 1;
	    
	    if (num <= 1)
            factorial = 1;
        else {
        	for(i = 1; i <= num; i++){    
		      factorial=factorial*i;    
		    }		    	
		}
	  	try {
	      Files.write(Paths.get(FILENAME), (factorial.toString()+"\n").getBytes());
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
         
	    if (num >= 1){
	      fact(num - 1);
	    }else if (num == 0){
	      return;
	    }
	    
        System.out.println(factorial);
    }
    
    
    
     public static void main(String []args){         
        System.out.println("Ingrese un numero:");
        Scanner input = new Scanner(System.in);
        int num = 0;
        try {
        	num = input.nextInt();
        	fact(num);
      	} catch (Exception e) {
        	System.out.println("ERROR: " + e);
      	}		
      	input.close();
     }
}
