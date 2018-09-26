import java.io.Console;
import java.util.Scanner;
public class Ejercicio5 {
	public static void main(String[] args) {
        Scanner input;
        int num, res;

        System.out.println("Ingrese un numero: ");
		input = new Scanner(System.in);
        num = input.nextInt();
        res = num % 2;

        if (res != 0) {
            System.out.println("No es un numero par");
        }
        else {
            System.out.println("Es un numero par");
        }
        input.close();
    }
}