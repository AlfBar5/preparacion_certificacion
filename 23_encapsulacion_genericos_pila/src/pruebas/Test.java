package pruebas;

public class Test {

	
	public static void main(String[] args) {
		


Pila<Integer> numeros = new Pila<Integer>();

		//Añadir elemetos
		numeros.agregar(10);
		numeros.agregar(20);
		numeros.agregar(30);
		numeros.agregar(40);
		numeros.agregar(50);
		
		

		
		Pila<String> palabras = new Pila<>();
		//añadir palabras
		palabras.agregar("uno");
		palabras.agregar("dos");
		palabras.agregar("tres");
		
		
		
		//método total de elementos
		int totalant = numeros.total();
		System.out.println("El total de elementos es: " + totalant);
		
		System.out.println("------------");
		
		//Sacar elemento
		int ultimo = numeros.sacar();
		System.out.println("El último elemento es: " + ultimo +" y ha sido eliminado");
		
		
		//método total de elementos
		int total = numeros.total();
		System.out.println("El total de elementos es: " + total);
		
		
		System.out.println("------------");
		
		
		//mostrar tamaño pila palabras
		mostrar2(numeros);
		
		System.out.println("------------");
		mostrar(palabras);


		System.out.println("------------");
		
		
		
		
		
	}
	
	
	//con caracter comodín ? vale para cualquier objeto de tipo pila
	
	static void mostrar(Pila<?> p) {
		System.out.println(p.total());
	}
	
	// restricción de pila. Restringe solo para superclases number
	static void mostrar2(Pila<? extends Number> numeros) {
		System.out.println(numeros.total());
	}
	
	
	
	
}
