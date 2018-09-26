import java.io.Console;
import java.util.Scanner;
public class Ejercicio17 {
	public static void main(String[] args) {
        Scanner input;
        float price;
        double discount, newp;
        newp = 0;

        System.out.println("Ingrese el precio: ");
		input = new Scanner(System.in);
        price = input.nextFloat();
        discount = price*0.25;
        newp = price - discount;
        System.out.printf("El precio anterior es de: %f \n\n", price);
        System.out.printf("El nuevo precio, con un descuento de %f, es de: %f", discount, newp);
        input.close();
    }
}