package pruebas;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test4 {

	public static void main(String[] args) {
		
		Integer[][] nums= {{3,-4,5,7,-1},{8,5,-1,2},{1,8}};
		//mostrar la suma de todos los positivos sin incluir duplicados 
		
		System.out.println(
		//convertir a un stream de arrays
		//Hay que generar un stream con todos estos arrays
			Arrays.stream(nums)   //esto es un stream de arrays de arrays- 
				.flatMap(a->Arrays.stream(a)) //Stream<String> //aplano el stream en un único array unidimensional
				.parallel() // distintos hilos, para optimizarlo
				.distinct()
				.filter(n->n>0) //positivos
				.collect(Collectors.summingInt(n->n))
		
		);
		
	}

}
