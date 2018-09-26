import java.util.Scanner;
public class SumInsert{
    public static void main(String[] args) 
    {
    	boolean condition = false;
    	int sum = 0;
    	int n = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese números \n");
        while(condition == false) {
			n = scan.nextInt();
			if(n == 0) {
				condition = true;				
			} else {
				sum = sum + n;				
			}		
		}
		System.out.print("Suma: "+sum+"\n");
    }
}
