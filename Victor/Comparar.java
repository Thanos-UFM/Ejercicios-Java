import java.util.Scanner;
public class Comparar{
    public static void main(String[] args) 
    {
    	int x = 0;
    	int y = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el primer número: \n");
        x = scan.nextInt();
        System.out.print("Ingrese el segundo número: \n");
        y = scan.nextInt();
        if(x-y < 0) {
			System.out.print(y+" es mayor que "+x+"\n");
		} else {
			if(x-y == 0) {
				System.out.print(y+" es igual que "+x+"\n");
			} else {
				System.out.print(y+" es menor que "+x+"\n");
			}
		}
    }
}
