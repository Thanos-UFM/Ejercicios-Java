import java.io.Console;
import java.util.Scanner;
public class Ejercicio1 {
	public static void main(String[] args) {
        Scanner input1, input2;
        int num1, num2, sum;

        System.out.println("Ingrese un numero: ");
		input1 = new Scanner(System.in);
        num1 = input1.nextInt();
        System.out.println("Ingrese otro numero: ");
		input2 = new Scanner(System.in);
        num2 = input2.nextInt();

        sum = num1 + num2;
        System.out.printf("La suma de %d y %d es: %d", num1, num2, sum);
        input1.close();
        input2.close();
    }
}