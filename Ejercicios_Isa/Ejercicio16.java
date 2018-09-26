import java.io.Console;
import java.util.Scanner;
public class Ejercicio16 {
	public static void main(String[] args) {
        Scanner input1, input2;
        int num1, num2;

        System.out.println("Ingrese un numero: ");
		input1 = new Scanner(System.in);
        num1 = input1.nextInt();
        System.out.println("Ingrese otro numero: ");
		input2 = new Scanner(System.in);
        num2 = input2.nextInt();
        if (num1 > num2 ) {
            System.out.printf("el numero %d es mayor que %d", num1, num2);
        }
        else if (num1 < num2 ) {
            System.out.printf("el numero %d es mayor que %d", num2, num1);
        }
        else {
            System.out.println("Los numeros son iguales");
        }
        input1.close();
        input2.close();
    }
}