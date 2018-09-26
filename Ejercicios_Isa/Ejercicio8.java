import java.io.Console;
import java.util.Scanner;
public class Ejercicio8 {
	public static void main(String[] args) {
        Scanner input;
        int num, i;

        System.out.println("Ingrese numero: ");
		input = new Scanner(System.in);
        num = input.nextInt();

        for (i = 1; i <= num; ++i) {
            if ( i < num ) {
                System.out.printf(" %d x", i);
            }
            else {
                System.out.printf(" %d ", i);
            }
        }
        input.close();
    }
}