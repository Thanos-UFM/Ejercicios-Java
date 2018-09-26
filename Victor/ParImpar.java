import java.util.Scanner;
public class ParImpar{
    public static void main(String[] args) 
    {
        int x = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un número: \n");
        x = scan.nextInt();
        if ( (x & 1) == 0 )
		{
			 System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
    }
}
