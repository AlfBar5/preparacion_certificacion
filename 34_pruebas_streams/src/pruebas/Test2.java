package pruebas;

import java.nio.file.FileSystemNotFoundException;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {

		List<Integer> lst=List.of(8,1,-2,6,5,11,9,-3,5,8);
		
		//System.out.println("----TODOS LOS NÚMEROS-----");
		//lst.forEach(n->System.out.println(n));
		
		System.out.println("----MÉDIA DE LOS POSITIVOS-----");
		
		//Media de los positivos
		System.out.println(
				
				lst.stream()
				.filter(n->n>=0) //stream números positivos
				.mapToInt(n->n)  //IntStream //convertimos a interfaz IntStream
				.average() //calculamos la media
				.orElse(0)
				
				);
		
		
		
		
		System.out.println("---- PARES ORDENADOS DE MAYOR A MENOR -----");
		//Mostrar pares ordenados de mayor a menor
		
		lst.stream()
			.filter(n->n%2==0) //stream números positivos
			.sorted((a,b)->b-a)
			.forEach(System.out::println);	
				
				
		System.out.println("---- NÚMERO MÁS ALTO -----");		
		System.out.println(
		
			//Número más alto
			lst.stream()
				.max((a,b)->a-b)
				.get()
				
				);
		

	}

}
