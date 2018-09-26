import java.util.Scanner;
public class Tabla{
    public static void main(String[] args) 
    {
        int x = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un número: \n");
        x = scan.nextInt();
        int i = 1;
        while (i <= 10) {
        	System.out.println(x+"*"+i+"="+x*i);
        	i = i+1;
    	}
    }
}
