import java.util.Scanner;
public class Product {
	public static void main(String[] args) {        
        System.out.println("Escribir dos numeros, separados por un enter");
        Scanner readme = new Scanner(System.in);
        try {
            int n1 = readme.nextInt();
            int n2 = readme.nextInt();

            table(n1, n2);
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        readme.close();
    }

    public static void table(Integer n1, Integer n2){
        System.out.print(n1);
        for(int i = 1; i < n2; i++){
            System.out.print(" + " + n1);
        }
        System.out.println(" = " + (n1*n2));
    }
}