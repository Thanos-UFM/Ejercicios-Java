import java.util.Scanner;
public class Estudiantes {
	public static void main(String[] args) {  
		String nombre;
        String[] nombres;
		Scanner scan = new Scanner(System.in);      
        System.out.println("Escriba su nombre completo");             
        try {
            nombre = scan.nextLine();
            nombres = nombre.split(" ");
            for (int i = 0; i < nombres.length; i ++){
                System.out.println(nombres[i] + " tiene " + nombres[i].length() + " letras.");
            }

        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        scan.close();
    }
}
