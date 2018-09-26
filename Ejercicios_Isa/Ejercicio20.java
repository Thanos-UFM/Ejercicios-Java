import java.io.Console;
import java.util.Scanner;
public class Ejercicio20 {
	public static void main(String[] args) {
        Scanner input1, input2;
        int num1, num2, i, res;
        res = 0;
        System.out.println("Ingrese un numero: ");
		input1 = new Scanner(System.in);
        num1 = input1.nextInt();
        System.out.println("Ingrese un numero: ");
		input2 = new Scanner(System.in);
        num2 = input2.nextInt();
        res = num1 - num2;
        for (i = 1; res>= 0; i++) {
            res = res - num2;
        }
        System.out.printf("%d / %d =  %d", num1, num2, (i-1));
        input1.close();
        input2.close();
    }
}