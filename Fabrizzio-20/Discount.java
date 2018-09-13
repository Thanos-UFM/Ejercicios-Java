import java.util.Scanner;
public class Discount {
	public static void main(String[] args) {        
        System.out.println("Escribir un numero");
        Scanner readme = new Scanner(System.in);
        int n1;
        double r;
        try {
            n1 = readme.nextInt();
            r = n1*.25;
            System.out.println("Precio original: " + n1);

            System.out.println("Precio con descuento: " + (n1-r));
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }        
        readme.close();
    }
}