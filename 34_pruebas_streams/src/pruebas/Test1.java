package pruebas;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		
		// Streams
		String names="Juan,Ana,Marta,Luis,Juan,Pedro,Marta,Lucas"; 
		
		//Mostrar todos los nombres en mayúsculas eliminando repetidos
		//y cada nombre en una línea
		
		
		
		Arrays.stream(names.split(","))//Stream<String>
		.distinct()
		.map(s->s.toUpperCase())
		.forEach(System.out::println);
		
		
	}

}
