import java.io.Console;
import java.util.Scanner;
public class Ejercicio24 {
	public static void main(String[] args) {
        Scanner input;
        String name;
        int i, lenparts;

        System.out.println("Ingrese su nombre: ");
		input = new Scanner(System.in);
        name = input.nextLine();

        String[] parts = name.split(" ");
        String parti;
        int lenparti;
        lenparts = parts.length;

        for ( i=0; i < lenparts; i++) {
            parti = parts[i];
            lenparti = parti.length();
            System.out.println("" + parti + " contiene " + lenparti + " letras.");
        }
        input.close();

    }
}