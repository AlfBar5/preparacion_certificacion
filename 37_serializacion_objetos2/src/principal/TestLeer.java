package principal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.Empleado;
import model.Persona;

public class TestLeer {

	public static void main(String[] args) {

		String ruta="c:\\temp\\person.obj";
		Empleado emp = new Empleado();
		
		//try con recursos
		try(FileInputStream fis=new FileInputStream(ruta);
				ObjectInputStream in= new ObjectInputStream(fis)
				){
				
				//leemos el objeto persona del fichero person.obj
				//pero como Empleado no es una clase serializable,
				//pues entonces se rellena el código de empleado a null
				//y como la edad es transient (no serializable) pues saca 0
				Persona persona=(Persona)in.readObject();
				
				System.out.println("Nombre: "+persona.getNombre());
				System.out.println("DNI: "+persona.getDni());
				System.out.println("Edad: "+persona.getEdad());
				//ERROR codigo no es serializable por el javabean empleado no es serializable
				System.out.println("Código del empleado: "+emp.getCodigo());
				
			
			
		}catch(IOException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}		
		
		
		
	}

}
