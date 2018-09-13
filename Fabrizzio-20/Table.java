import java.util.Scanner;
public class Table {
	public static void main(String[] args) {        
        System.out.println("Escribir un numero");
        Scanner readme = new Scanner(System.in);        
        int n1;
        try {
            n1 = readme.nextInt();
            for(int i = 0; i <= 10; i++){    
                System.out.println(i + " * " + n1 + " = " + (i*n1));
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }        
        readme.close();
    }
}