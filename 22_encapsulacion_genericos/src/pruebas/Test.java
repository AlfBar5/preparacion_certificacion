package pruebas;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		
		//Con esta clase, se puede crear una instancia de Caja con cualquier tipo de objeto, como un String, un Integer, una Lista, etc. Por ejemplo:


		

		// Crear una caja con un Integer
		Capsula<Integer> capsula1 = new Capsula<Integer>(42);
		
		System.out.println("¿Es nulo el Integer?: "+capsula1.isNull());
		
		// Crear una caja con un String
		Capsula<String> capsula2 = new Capsula<String>("Hola");
		
		System.out.println("¿Es nulo el String?: "+capsula2.isNull());

		// Crear una caja con una Lista
		Capsula<List<String>> capsula3 = new Capsula<>(Arrays.asList("uno", "dos", "tres"));
		
		System.out.println("¿Es nula la lista?: "+capsula3.isNull());
	}

}
