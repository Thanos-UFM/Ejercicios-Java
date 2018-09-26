import java.util.Scanner;
public class Division{
    public static void main(String[] args) 
    {
    	int x = 0;
    	int y = 0;
    	int div = 0;
    	int remainder = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        x = scan.nextInt();
        System.out.print("Ingrese el divisor: ");
        y = scan.nextInt();
        int count = y;
        while (count <=	x) {
        	div = div + 1;
			count = count + y;
		}
		count = count - y;
		remainder = x - count;
		System.out.print("Resultado: "+div+" - Remainder: "+remainder+"\n");
    }
}
