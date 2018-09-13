import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {        
        System.out.println("Escribir un numero");
        Scanner readme = new Scanner(System.in);        
        int n;        
        boolean isPrime = true;
        try {
            n = readme.nextInt();
            
            for (long factor = 2; factor*factor <= n; factor++) {                
                if (n % factor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(n + " es primo");
            }else{
                System.out.println(n + " no es primo");
            }

        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }        
        readme.close();
    }
}