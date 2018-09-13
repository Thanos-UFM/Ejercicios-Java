import java.util.Scanner;
public class SmallUneven {
	public static void main(String[] args) {        
        System.out.println("Escribir un numero");
        Scanner readme = new Scanner(System.in);        
        int n1;
        try {
            n1 = readme.nextInt();
            for (int i = 0; i < n1; i ++){
                if (i%2 != 0){
                    System.out.print(i + ", ");
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }        
        readme.close();
    }
}