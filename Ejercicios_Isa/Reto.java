import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reto {
    public static void main(String[] args) {
        int i, x, min, max, num, div;
        i = 0;
        x = 0;
        num = 0;
        min = 0;
        max = 0;
        div = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("testreto.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if ( i ==  0 ) {
                    min = Integer.parseInt(line);
                    i++;
                }
                else if ( i == 1 ) {
                    max = Integer.parseInt(line);
                    i++;
                }
                else {
                    num = Integer.parseInt(line);
                    i++;
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        for ( x = min; x <= max && x >= min; x++ ) {
            if (num == 0) {
                System.out.print("Error: El divisor no puede ser 0");
                break;
            }
            else {
                div = x % num;
                if (div == 0) {
                    System.out.print(x + ",");
                }
            }
        }

    }
}