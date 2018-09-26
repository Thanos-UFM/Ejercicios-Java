import java.io.Console;
import java.util.Scanner;
public class Ejercicio2 {
	public static void main(String[] args) {
        Scanner input;
        int num;

        System.out.println("Ingrese un numero: ");
		input = new Scanner(System.in);
        num = input.nextInt();

        if (num == 7) {
            System.out.println("Numero de la suerte");
        }
        else {
            System.out.println("Mala suerte");
        }
        input.close();
    }
}