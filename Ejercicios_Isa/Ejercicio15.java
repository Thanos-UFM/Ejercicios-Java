import java.io.Console;
import java.util.Scanner;
public class Ejercicio15 {
	public static void main(String[] args) {
        Scanner input;
        int num, i, sum, average;
        average = 0;
        System.out.println("Ingrese numero: ");
		input = new Scanner(System.in);
        num = input.nextInt();
        sum = num;

        for (i = 1; num != 0; i++) {
            System.out.println("Ingrese numero: ");
            input = new Scanner(System.in);
            num = input.nextInt();
            sum = sum + num;
        }
        average = sum / (i-1);
        System.out.printf("%d / %d", sum, i);
        System.out.printf("El promedio de los numeros ingresados = %d", average);
        input.close();
    }
}