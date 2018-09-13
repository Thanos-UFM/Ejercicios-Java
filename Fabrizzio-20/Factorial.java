import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {        
        System.out.println("Escribir un numero");
        Scanner readme = new Scanner(System.in);        
        int n1;
        int fact = 1;
        try {
            n1 = readme.nextInt();
            for(int i = 1; i <= n1; i++){    
                fact = fact * i;    
            }    
            System.out.println("Factorial de " + n1 + " es " + fact);    
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }        
        readme.close();
    }
}