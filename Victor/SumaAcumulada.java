import java.util.Scanner;
public class SumaAcumulada{
    public static void main(String[] args) 
    {
        int x = 0;
        int n = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un número: \n");
        x = scan.nextInt();
        int i = x;
        while (i > 1) {
        	n = n+i;
        	i = i-1;
    	}
		System.out.println("Suma: "+n);
    }
}
