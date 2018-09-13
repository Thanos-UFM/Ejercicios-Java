import java.util.Scanner;
public class Bank {
	public static void main(String[] args) {
        Scanner readme;
        int cincuenta;
        int choca;
        int decimo;
        int len;

        try {
            System.out.print("¿Cuantas fichas de 50 hay? ");
            readme = new Scanner(System.in);
            cincuenta = readme.nextInt();            


            System.out.print("¿Cuantas fichas de 25 hay? ");
            //readme = new Scanner(System.in);
            choca = readme.nextInt();


            System.out.print("¿Cuantas fichas de 10 hay? ");
            //readme = new Scanner(System.in);
            decimo = readme.nextInt();


            System.out.print("¿Cuantas fichas de 1 hay? ");
            //readme = new Scanner(System.in);
            len = readme.nextInt();

            double total = Math.floor(((cincuenta * .5) + (choca * .25) + (decimo *.1) + (len * 0.01))*100)/100;
            System.out.println("Total: " + total);
            readme.close();            
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
    }
}