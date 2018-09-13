import java.util.Scanner;
public class N {
	public static void main(String[] args) {        
        System.out.println("Escribir un numero");
        Scanner readme = new Scanner(System.in);
        int n1;
        int r = 0;
        try {
            n1 = readme.nextInt();
            for (int i = 1; i < n1; i++){
                System.out.print(i + " + ");
                r += i;
            }
            System.out.println(n1 + " = " + r);
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }        
        readme.close();
    }
}