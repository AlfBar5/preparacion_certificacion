package pruebas;

import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {

		Stream<Integer> st=Stream.of(8,1,-2,6,5,11,9,-3,5,8);
		System.out.println(st
				.parallel() //stream<Integer>
				.count()
				
				);
		
		
		//una vez que conviertes el stream a paralelo
		//todo lo que se va a generar sale descolocado
		
		System.out.println("-----salen descolocados--------");
		
		Stream<Integer> st2=Stream.of(8,1,-2,6,5,11,9,-3,5,8);
		st2
		.parallel()
		.forEach(System.out::println);
		

		System.out.println("-----salen descolocados--------");
		
		Stream<Integer> st3=Stream.of(8,1,-2,6,5,11,9,-3,5,8);
		st3
		.parallel()
		.filter(n->n>0)
		.forEach(System.out::println);
		
		//Para volver a colocar según orden Stream principal ---> convertir a secuencial
		System.out.println("-----convertir a secuencial--------");
		
		Stream<Integer> st4=Stream.of(8,1,-2,6,5,11,9,-3,5,8);
		st4
		.parallel()
		.filter(n->n>0)
		.sequential() // convierte stream paralelo a secuencial
		.forEach(System.out::println);
		
		
	}

}
