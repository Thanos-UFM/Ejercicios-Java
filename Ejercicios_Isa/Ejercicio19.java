import java.io.Console;
import java.util.Scanner;
public class Ejercicio19 {
	public static void main(String[] args) {
        Scanner input;
        int num, i, mod;

        System.out.println("Ingrese numero: ");
		input = new Scanner(System.in);
        num = input.nextInt();

        for (i = 1; i <= num; ++i) {
            mod = i % 2;
            if ( mod != 0 ) {
                System.out.printf(" %d, ", i);
            }
            else if ( mod != 0 && i == num ) {
                System.out.printf(" %d ", i);
            }
        }
        input.close();
    }
}