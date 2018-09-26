import java.util.Scanner;
public class Descuento{
    public static void main(String[] args) 
    {
    	double x = 0;
    	double discount = 0;
    	double discounted = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el precio original: \n");
        x = scan.nextInt();
        discount = x*0.25;
        discounted = x-discount;
        System.out.print("Precio original: "+x+"\n");
        System.out.print("Precio con descuento: "+discounted+" \n");
    }
}
