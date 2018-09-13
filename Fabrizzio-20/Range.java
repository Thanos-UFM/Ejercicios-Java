import java.util.Scanner;
public class Range {
	public static void main(String[] args) {        
        System.out.println("Escribir un numero");
        Scanner readme = new Scanner(System.in);        
        double n1;
        try {
            n1 = readme.nextDouble();
            if (n1 >= 20 && n1 <= 100){
                System.out.println("ENTRE EL 20 y 100");
            }else{
                System.out.println("FUERA DE RANGO");
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }        
        readme.close();
    }
}