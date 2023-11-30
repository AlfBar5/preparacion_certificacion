package pruebas;

import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {

		Stream<Integer> st=Stream.of(8,1,-2,6,5,11,9,-3,5,8);
		
		

		//quitar duplicados y negativos, ordenar y mostrar
		st
		.parallel()  //usar varios hilos con stream paralelo
		.distinct()
		.filter(n->n>0)
		.sorted()
		.sequential() // convierte stream paralelo a secuencial. Convierte a un único hil
		.forEach(System.out::println);
		

	}

}
