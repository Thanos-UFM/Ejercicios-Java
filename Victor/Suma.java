import java.util.Scanner;
public class Suma{
    public static void main(String[] args) 
    {
        int x,y,z = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un n�mero: \n");
        x = scan.nextInt();
        System.out.print("Ingrese otro n�mero: \n");
        y = scan.nextInt();
        z = x+y;
        System.out.println("Suma: "+z);
    }
}
