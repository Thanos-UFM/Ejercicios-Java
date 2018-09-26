import java.io.Console;
import java.util.Scanner;
public class Ejercicio10 {
	public static void main(String[] args) {
        int num, res, i;
        for ( num = 1; num <= 10; num ++) {
            for ( i = 1; i <= 10; i++) {
                res = num * i;
                System.out.printf("%d * %d = %d \n", num, i, res);
            }
        }
    }
}