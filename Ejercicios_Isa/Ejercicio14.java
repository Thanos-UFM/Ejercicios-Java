import java.io.Console;
import java.util.Scanner;
public class Ejercicio14 {
	public static void main(String[] args) {
        Scanner input;
        int num, i, sum, mod;
        sum = 0;
        mod = 0;

        System.out.println("Ingrese un numero: ");
		input = new Scanner(System.in);
        num = input.nextInt();

        for (i = 1; sum < num; ++i) {
            mod = i % 2;
            if ( mod != 0 && sum <= num - 2) {
                System.out.printf(" %d, ", i);
                sum = sum + 1;
            }
            else if ( mod != 0 && sum == num - 1) {
                System.out.printf(" %d ", i);
                sum = sum + 1;
            }
        }
        input.close();
    }
}