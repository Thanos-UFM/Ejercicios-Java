import java.util.Scanner;
public class Bisiesto{
    public static void main(String[] args) 
    {
        int x = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un n�mero: \n");
        x = scan.nextInt();
        if ( x % 4 == 0)
		{
			 System.out.println("A�o bisiesto");
		}
		else {
			System.out.println("No es a�o bisiesto");
		}
    }
}
