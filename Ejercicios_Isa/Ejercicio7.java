import java.io.Console;
import java.util.Scanner;
public class Ejercicio7 {
	public static void main(String[] args) {
        Scanner input;
        long year, res;

        System.out.println("Ingrese año: ");
		input = new Scanner(System.in);
        year = input.nextLong();
        res = year % 4;

        if (res != 0) {
            System.out.println("No es bisiesto");
        }
        else {
            System.out.println("Si es bisiesto");
        }
        input.close();
    }
}