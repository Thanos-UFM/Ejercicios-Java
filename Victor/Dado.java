public class Dado{
    public static void main(String[] args) 
    {
    	int max = 6;
    	int min = 1;
		int x = (int) (Math.random() * ((max - min) + 1)) + min;
    	int y = (int) (Math.random() * ((max - min) + 1)) + min;
    	int z = (int) (Math.random() * ((max - min) + 1)) + min;
    	int total=x+y+z;
		System.out.print("Primer lanzamiento: "+x+"\n");
		System.out.print("Segundo lanzamiento: "+y+"\n");
		System.out.print("Tercer lanzamiento: "+z+"\n");
		System.out.print("Total: "+total+"\n");
    }
}
