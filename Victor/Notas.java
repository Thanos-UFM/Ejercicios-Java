import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Notas {

	private static final String FILENAME = "notas.txt";

	public static void main(String[] args) {

		BufferedReader br = null;
		FileReader fr = null;
		
		try {

			//br = new BufferedReader(new FileReader(FILENAME));
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String sCurrentLine;
			String nombre = "";
			int x = 0;
			int y = 0;
			int z = 0;
			int count = 0;
			while ((sCurrentLine = br.readLine()) != null) {
				if (count == 0)	{
					nombre = sCurrentLine;
				} else if (count == 1) {
					x = Integer.parseInt(sCurrentLine);
					//System.out.println(x);
				} else if (count == 2) {
					y = Integer.parseInt(sCurrentLine);
					//System.out.println(y);
				} else if (count == 3) {
					z = Integer.parseInt(sCurrentLine);
					//System.out.println(z);
				}		        
		        count = count + 1;
			}
			int promedio = (x+y+z)/3;
			System.out.println("Nombre: "+nombre);
			System.out.println("Promedio: "+promedio);			
		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}

}
