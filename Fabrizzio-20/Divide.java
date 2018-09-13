import java.util.Scanner;
public class Divide {
	public static void main(String[] args) {        
        System.out.println("Escribir dos numeros, separados por un enter");
        Scanner readme = new Scanner(System.in);        
        int n1;
        int n2;
        try {
            n1 = readme.nextInt();
            n2 = readme.nextInt();

            System.out.println("Division: " + divide(n1, n2));                        
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }        
        readme.close();
    }

    static int divide(int dividend, int divisor) {
        int quotient = 0;
        int sign = ((dividend < 0) ^ 
                   (divisor < 0)) ? -1 : 1;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);                     
         
        while (dividend >= divisor)
        {
            dividend -= divisor;
            ++quotient;
        }
     
        return sign * quotient;
    }
}