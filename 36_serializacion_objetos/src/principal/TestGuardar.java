package principal;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.Persona;

public class TestGuardar {

	public static void main(String[] args) {

		String ruta="c:\\temp\\person.obj";
		Persona persona = new Persona("persona 1", "22222w", 30, "codigo30");
		
		
		//try con recursos
		try(FileOutputStream fos=new FileOutputStream(ruta);
				ObjectOutputStream out= new ObjectOutputStream(fos)
				){
			
				//guardamos objeto Persona en código binario
				//solo se puede leer con readObject
				out.writeObject(persona);
				System.out.println("Persona guardada");
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		

	}

}
