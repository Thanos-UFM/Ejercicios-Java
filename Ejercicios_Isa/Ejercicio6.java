import java.io.Console;
import java.util.Scanner;
public class Ejercicio6 {
	public static void main(String[] args) {
        Scanner input;
        int num;

        System.out.println("Ingrese un numero: ");
		input = new Scanner(System.in);
        num = input.nextInt();

        if (num >= 20 && num <= 100) {
            System.out.println("El numero esta dentro del rango");
        }
        else {
            System.out.println("El numero no esta dentro del rango");
        }
        input.close();
    }
}