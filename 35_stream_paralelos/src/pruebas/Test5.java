package pruebas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Test5 {
	
	
	public static void main(String[] args) throws IOException {
		var fr=new PrintWriter("c:\\temp\\results.txt");
		try(var reader=new FileReader("c:\\temp\\names.txt");
				var bf=new BufferedReader(reader)){
			fr.println(bf.readLine());
		}
		catch(IOException ex) {
			fr.println("default");
		}		
		finally {
			fr.close();
		}
	}
	

}
