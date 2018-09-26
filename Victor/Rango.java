import java.util.Scanner;
public class Rango{
    public static void main(String[] args) 
    {
        int x = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un número: \n");
        x = scan.nextInt();
        if ( (x >=  20) && (x <= 100))
		{
			 System.out.println("Está en el rango");
		}
		else {
			System.out.println("No está en el rango");
		}
    }
}
