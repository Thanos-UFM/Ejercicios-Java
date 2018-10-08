import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Sorpresa2 {
  /**
   * This class shows how to write file in java
   * @param args
   * @throws IOException 
   */
  public static void main(String[] args) {
      System.out.println("Numero a factorizar: ");
      Scanner scanner = new Scanner(System.in);
      Integer n = 0;
      try {
        n = scanner.nextInt();
      } catch (Exception e) {
        System.out.println("ERROR: " + e);
      }      

      factorial(n, "");
      scanner.close();
  }

  private static void factorial(Integer n, String data) {
    Integer i = 0;
    Integer result = 1;
    for(i=1;i<=n;i++){    
      result=result*i;    
    }
    System.out.println(result);
    data = data + result.toString() + "\n";
    try {
      Files.write(Paths.get("files.txt"), data.getBytes());
    } catch (IOException e) {
        e.printStackTrace();
    }
    if (n > 1){
      factorial(n - 1, data);
    }else if (n == 0){
      data = 1 + result.toString() + "\n";
    }
    else{
      System.out.println("TERMINADO! Numero menor a 1");
    }    
  }
}