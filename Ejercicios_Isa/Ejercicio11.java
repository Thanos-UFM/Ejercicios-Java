import java.io.Console;
import java.util.Scanner;
public class Ejercicio11 {
	public static void main(String[] args) {
        Scanner input1, input2;
        int num1, num2, sum, i;
        sum = 0;

        System.out.println("Ingrese un numero: ");
		input1 = new Scanner(System.in);
        num1 = input1.nextInt();
        System.out.println("Ingrese otro numero: ");
		input2 = new Scanner(System.in);
        num2 = input2.nextInt();

        System.out.printf("%d * %d = ", num1, num2);
        for (i = 1; i <= num2; i++) {
            if ( i < num2 ) {
                System.out.printf(" %d +", num1);
                sum = sum + num1;
            }
            else {
                System.out.printf(" %d ", num1);
                sum = sum + num1;
            }
        }
        System.out.printf(" = %d", sum);

        input1.close();
        input2.close();
    }
}