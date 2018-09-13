import java.util.Scanner;
public class LetterCounter {
	public static void main(String[] args) {        
        System.out.println("Escribir nombre");
        Scanner readme = new Scanner(System.in);        
        String name;
        String[] names;
        try {
            name = readme.nextLine();
            names = name.split(" ");

            for (int i = 0; i < names.length; i ++){
                System.out.println(names[i] + " tiene " + names[i].length() + " letras.");
            }

        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        readme.close();
    }
}