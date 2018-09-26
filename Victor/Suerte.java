import java.util.Scanner;
public class Suerte
{
    public static void main(String[] args) 
    {
        int x = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un número: \n");
        x = scan.nextInt();
        if (x == 7) {
        	System.out.print("Número de la suerte \n");
		}
    }
}
