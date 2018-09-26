import java.util.Scanner;
public class Mayor{
    public static void main(String[] args) 
    {
        int x,y,z = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un número: \n");
        x = scan.nextInt();
        System.out.print("Ingrese otro número: \n");
        y = scan.nextInt();
        System.out.println("El mayor es: ");
        if (x > y) {
	        System.out.println(x);
		}
		else {
			System.out.println(y);
		}
    }
}
