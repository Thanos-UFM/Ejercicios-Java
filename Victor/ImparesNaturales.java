import java.util.Scanner;
public class ImparesNaturales{
    public static void main(String[] args) 
    {
    	int n = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un número: \n");
        n = scan.nextInt();
        for(int i = 1; i < n; i++) {
        	if(i%2 != 0) {
				System.out.print(i);
				if(i !=n-1) {
					System.out.print(",");
				}
			}			
		}		
    }
}
