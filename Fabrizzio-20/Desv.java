import java.util.Scanner;
public class Desv {
	public static void main(String[] args) {
        double r;
        try {
            r = (83.5 - 80) / 4;

            System.out.println("Desviacion estandar: " + r);
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        } 
    }
}