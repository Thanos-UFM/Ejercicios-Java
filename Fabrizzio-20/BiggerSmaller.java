import java.util.Scanner;
public class BiggerSmaller {
	public static void main(String[] args) {        
        System.out.println("Escribir dos numeros, separarlos con un enter");
        Scanner readme = new Scanner(System.in);        
        double n1, n2;
        try {
            n1 = readme.nextDouble();
            n2 = readme.nextDouble();
            if (n1 > n2){
                System.out.println(n1 + " es mayor a " + n2);
            }else if (n1 < n2){
                System.out.println(n2 + " es mayor a " + n1);
            }else{
                System.out.println(n2 + " es igual a " + n1);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        readme.close();
    }
}