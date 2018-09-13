import java.util.Scanner;
public class Luck {
	public static void main(String[] args) {        
        System.out.println("Escribir un numero");
        Scanner readme = new Scanner(System.in);        
        double n1;
        try {
            n1 = readme.nextDouble();
            if (n1 == 7){
                System.out.println("NUMERO DE LA SUERTE");
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }        
        readme.close();
    }
}