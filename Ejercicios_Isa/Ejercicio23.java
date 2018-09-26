import java.io.Console;
import java.util.Scanner;
public class Ejercicio23 {
	public static void main(String[] args) {
        Scanner input1, input2, input3, input4;
        int m50, m25, m10, m01;
        double total;

        System.out.println("Ingrese la cantidad de monedas de 50 centavos: ");
		input1 = new Scanner(System.in);
        m50 = input1.nextInt();

        System.out.println("Ingrese la cantidad de monedas de 25 centavos: ");
		input2 = new Scanner(System.in);
        m25 = input2.nextInt();

        System.out.println("Ingrese la cantidad de monedas de 10 centavos: ");
		input3 = new Scanner(System.in);
        m10 = input3.nextInt();

        System.out.println("Ingrese la cantidad de monedas de 1 centavos: ");
		input4 = new Scanner(System.in);
        m01 = input4.nextInt();

        total = (m50 * 0.5) + (m25 * 0.25) + (m10 * 0.1) + (m01 *0.01);
        System.out.printf("El total en monedas es de: %f \n\n", total);

        input1.close();
        input2.close();
        input3.close();
        input4.close();
    }
}