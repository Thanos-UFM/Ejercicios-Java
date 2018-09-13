import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {        
        System.out.println("Escribir un año");
        Scanner readme = new Scanner(System.in);
        try {
            double year = readme.nextDouble();
            boolean isLeapYear;

            isLeapYear = (year % 4 == 0);            
            isLeapYear = isLeapYear && (year % 100 != 0);
            isLeapYear = isLeapYear || (year % 400 == 0);

            System.out.println("Es bisiesto? " + isLeapYear);
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }        
        readme.close();
    }
}