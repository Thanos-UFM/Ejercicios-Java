import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio25 {
    public static void main(String[] args) {
        int i, nota, sum;
        int average;
        i = 0;
        sum = 0;
        nota = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                i++;
                if ( i <=  1 ) {
                    System.out.print(line + ",");
                }
                else if ( i > 1 ) {
                    nota = Integer.parseInt(line);
                    sum = sum + nota;
                }
            }
            average = sum/(i - 1);
            System.out.printf(" el promedio de sus notas es: %d", average);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}