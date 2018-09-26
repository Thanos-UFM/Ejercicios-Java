import java.util.Random;
public class Ejercicio22 {
	public static void main(String[] args) {
        int i, sum;
        sum = 0;
        for (i = 1; i <= 3; i++ ) {
            Random rand = new Random();
            int value = rand.nextInt((6 - 1) + 1) + 1;
            System.out.printf("valor no. %d: %d \n\n", i, value);
            sum = sum + value;
        }
        System.out.printf("La suma es: %d ", sum);

    }
}