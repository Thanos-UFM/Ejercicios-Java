import java.io.Console;
import java.util.Scanner;
public class Ejercicio12 {
	public static void main(String[] args) {
        Scanner input;
        int num, i, sum, mod;
        mod = 0;
        sum = 0;

        System.out.println("Ingrese numero: ");
		input = new Scanner(System.in);
        num = input.nextInt();

        for (i = 1; i < num; i++) {
            mod = num % i;
            if ( mod == 0 ) {
                sum = sum + 1;
            }
        }
        if ( sum > 1 ) {
            System.out.printf(" %d no es primo", num);
        }
        else {
            System.out.printf(" %d si es primo", num);
        }
        input.close();
    }
}