import java.util.Scanner;
public class SumaSucesiva{
    public static void main(String[] args) 
    {
        int x,y,z,i = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un número: \n");
        x = scan.nextInt();
        System.out.print("Ingrese otro número: \n");
        y = scan.nextInt();        
		System.out.print(x+"*"+y+"=");   
		z = x*y; 
        while (i < z) {
			if (i>0) {
				System.out.print("+"); 
			}
        	System.out.print(x);        	
			i = i + x;
		}
		if(y == 0 || x == 0) {
			System.out.print("0");
		}		
		System.out.print("="+z); 
    }
}
