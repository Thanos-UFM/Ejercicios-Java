import java.util.Scanner;
public class Tables {
	public static void main(String[] args) {        
        System.out.println("Escribir un numero");
        Scanner readme = new Scanner(System.in);
        try {
            for (int i = 0; i <= 10; i++){
                table(i);
            }            
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        readme.close();
    }

    public static void table(Integer n1){
        System.out.println("---" + n1 + "---")
        for(int i = 0; i <= 10; i++){
            System.out.println(i + " * " + n1 + " = " + (i*n1));
        }
    }
}