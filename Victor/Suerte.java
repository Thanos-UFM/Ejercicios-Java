import java.util.Scanner;
public class Suerte
{
    public static void main(String[] args) 
    {
        int x = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un n�mero: \n");
        x = scan.nextInt();
        if (x == 7) {
        	System.out.print("N�mero de la suerte \n");
		}
    }
}
