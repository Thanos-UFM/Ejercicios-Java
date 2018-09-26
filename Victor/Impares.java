import java.util.Scanner;
public class Impares{
    public static void main(String[] args) 
    {
    	int n = 0;
    	int count = 0;
    	int pivot = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un número: \n");
        n = scan.nextInt();
        while (count != n) {
        	pivot = pivot + 1;
        	if(pivot%2 != 0) {
				System.out.print(pivot);
				count = count + 1;
				if(count !=n) {
				System.out.print(",");
				}
			}			
		}		
    }
}
