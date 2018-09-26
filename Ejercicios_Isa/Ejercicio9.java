import java.io.Console;
import java.util.Scanner;
public class Ejercicio9 {
	public static void main(String[] args) {
        Scanner input;
        int num, res, i;

        System.out.println("Ingrese numero: ");
		input = new Scanner(System.in);
        num = input.nextInt();

        for ( i = 1; i <= 10; i++) {
            res = num * i;
            System.out.printf("%d * %d = %d \n", num, i, res);
        }
        input.close();
    }
}