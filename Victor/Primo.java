import java.util.Scanner;
public class Primo{
    public static void main(String[] args) 
    {
        int n = 0;
        int primo = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un número: \n");
        n = scan.nextInt();
        if (n == 2) {
			System.out.print("Es primo \n");
			return;
		}
		//check if n is a multiple of 2		
		if (n%2 == 0) {
			System.out.print("No es primo \n");
			return;
		}
		//if not, then just check the odds
		for(int i=2;2*i<n;i++) {
        	if(n%i==0) {
            	System.out.print("No es primo porque es divisible entre: "+i+"\n");
				primo = 0;			      	
        	}
	    }
	    if(primo==0) {
	    	return;
		}
	    System.out.print("Es primo \n");
    }
}
