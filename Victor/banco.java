import java.util.Scanner;
public class banco{
    public static void main(String[] args) 
    {
    	int v = 0;
		int x = 0;
    	int y = 0;
    	int z = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de monedas de 1 centavo: \n");
        v = scan.nextInt();
        System.out.print("Ingrese la cantidad de monedas de 10 centavos: \n");
        x = scan.nextInt();
        System.out.print("Ingrese la cantidad de monedas de 25 centavos: \n");
        y = scan.nextInt();
        System.out.print("Ingrese la cantidad de monedas de 50 centavos: \n");
        z = scan.nextInt();
        int total = ((v)+(x*10)+(y*25)+(z*50));
        int centavos = total%100;
        int quetzales = total/100;
        System.out.print("Total: "+ quetzales +" quetzales con "+centavos+ " centavos \n");
    }
}
