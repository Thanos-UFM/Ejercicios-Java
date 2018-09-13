import java.util.ArrayList;
import java.util.Scanner;
public class Average {
	public static void main(String[] args) {     
        Scanner readme = new Scanner(System.in);          
        int n1 = 1;
        ArrayList<Integer> alist=new ArrayList<Integer>();
        try {
            while (n1 != 0){
                System.out.println("Escribir un numero (terminar programam con 0): ");
                readme = new Scanner(System.in);
                n1 = readme.nextInt();
                alist.add(n1);

                System.out.println("Promedio: " + calculateAverage(alist));
            }                
            
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }        
        readme.close();
    }

    public static double calculateAverage(ArrayList<Integer> marks) {
        Integer sum = 0;
        if(!marks.isEmpty()) {
            for (Integer mark : marks) {
                sum += mark;
            }
            return sum.doubleValue() / marks.size();
        }
        return sum;
    }
}