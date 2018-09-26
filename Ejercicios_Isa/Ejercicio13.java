import java.io.Console;
import java.util.Scanner;
public class Ejercicio13 {
	public static void main(String[] args) {
        Scanner input;
        int num, i, sum;
        sum = 0;

        System.out.println("Ingrese numero: ");
		input = new Scanner(System.in);
        num = input.nextInt();

        for (i = 1; i <= num; ++i) {
            sum = sum + i;
            if ( i < num ) {
                System.out.printf(" %d +", i);
            }
            else {
                System.out.printf(" %d  = %d ", i, sum);
            }
        }
        input.close();
    }
}