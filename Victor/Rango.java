import java.util.Scanner;
public class Rango{
    public static void main(String[] args) 
    {
        int x = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un n�mero: \n");
        x = scan.nextInt();
        if ( (x >=  20) && (x <= 100))
		{
			 System.out.println("Est� en el rango");
		}
		else {
			System.out.println("No est� en el rango");
		}
    }
}
