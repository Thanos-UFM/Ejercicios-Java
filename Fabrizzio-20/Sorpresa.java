import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javafx.scene.shape.Line;

public class Sorpresa {

	private static final String FILENAME = "file.txt";
	public static void main(String[] args) {
		BufferedReader br = null;
        FileReader fr = null;
        ArrayList<Integer> lines=new ArrayList<Integer>();
		try {			
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
                System.out.println("-----------");
                
                lines.add(Integer.parseInt(sCurrentLine));
            }
            

            try {
                for (int i = lines.get(0); i <= lines.get(1); i++){                
                    if (i%lines.get(2) == 0){
                        System.out.println(i);
                    }
                }
            } catch (Exception e) {
                System.out.println("ERROR!: " + e);
            }            
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