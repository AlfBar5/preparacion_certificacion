package pruebas;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException{


		List<Integer> lst=List.of(11,3,2,8,4,22,7,6);
	
		
		//Implementar dos tareas que se ejecuten concurrentemente
		// Una calcula el valor medio de la lista
		// Otra el mayor de los números
		
		ExecutorService executor=Executors.newCachedThreadPool();
		
		//Tarea 1 - media de los números
		Future<Double> f1 =executor.submit(()->{
			return 
					lst.stream()
					.mapToDouble(n->n)   //Convertimos a interfaz DoubleStream
					.average()
					.orElse(0.0);  //orElse devolvemos algo por si acaso no hay resultado
					
					
		});
		
		// Tarea 2 - numero mayor
		Future<Integer> f2 =executor.submit(()->{
			return 
					lst.stream()
					.mapToInt(n->n)  //IntStream //convertimos a interfaz IntStream
					.max()
					.orElse(0); //orElse devolvemos algo por si acaso no hay resultado
					
	
					
		});
		
		
		
		while(!f1.isDone() || !f2.isDone()) {
			System.out.println("Esperando resultados...");
		}
		
		
		System.out.println("Media: "+f1.get());
		System.out.println("Número mayor: "+f2.get());
		
		
		//el pool de hilos sigue activo
		//forzamos el cierre del pool
		executor.shutdown();

		
		
		
		
		
		
		
		
		/*
		 
		//La forma del profe
		
		List<Integer> lst=List.of(11,3,2,8,4,22,7,6);
		
		//implementar dos tareas que se ejecuten concurrentemente
		//una calcula al valor medio de la lista y otra
		//el mayor de los números
		ExecutorService executor=Executors.newCachedThreadPool();
		executor.submit(()->
				System.out.println(lst.stream()
				.collect(Collectors.averagingDouble(n->n)))
				);
		executor.submit(()->
			System.out.println(lst.stream()
				.max((a,b)->a-b).orElse(-1))
		);
		
		
		*/
		
		
		
		
		
		
		
		
	}

}
