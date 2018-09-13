import java.util.Scanner;
public class Uneven {
	public static void main(String[] args) {        
        System.out.println("Escribir un numero");
        Scanner readme = new Scanner(System.in);        
        int n1;
        try {
            n1 = readme.nextInt();
            int uneven = 0;
            int i = 0;
            while (uneven < n1){
                if (i%2 != 0){
                    System.out.print(i + ", ");
                    uneven++;
                }
                i++;
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }        
        readme.close();
    }
}