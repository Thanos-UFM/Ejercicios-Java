import java.util.Scanner;
public class Pair {
	public static void main(String[] args) {        
        System.out.println("Escribir un numero");
        Scanner readme = new Scanner(System.in);        
        double n1;
        try {
            n1 = readme.nextDouble();
            if (n1%2 == 0){
                System.out.println("PAR");
            }else{
                System.out.println("IMPAR");
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }        
        readme.close();
    }
}