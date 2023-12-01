package principal;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.Persona;
import model.Empleado;

public class TestGuardar {

	public static void main(String[] args) {

		Empleado emp = new Empleado("codigo500");
		String ruta="c:\\temp\\person.obj";
		Persona persona = new Persona("persona 1", "22222w", 30, emp);
		
		
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
		
		//falla si la clase Empleado no es serializable
	}

}
