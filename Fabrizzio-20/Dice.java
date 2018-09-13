import java.util.Scanner;
public class Dice {
	public static void main(String[] args) {          
        System.out.println("Primer dado:" + (Math.floor(Math.random() * ((6 - 1) + 1)) + 1));
        System.out.println("Segundo dado:" + (Math.floor(Math.random() * ((6 - 1) + 1)) + 1));
        System.out.println("Tercer dado:" + (Math.floor(Math.random() * ((6 - 1) + 1)) + 1));
    }
}