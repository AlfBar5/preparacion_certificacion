package pruebas;

import java.util.List;

public class Test {

	
	public void print(List<Integer> lista, Integer num) {

		//metemos en integer num en la lista lista
		lista.add(num);
		
		

	}
	
	
	
	
	public void print2(List<?> lista2, Integer num2) {

		//intentamos meter un integer num en la lista lista2
		//lista2.add(num2); //no se pueden añadir números
		
		//solo te deja hacer cosas que podrían servir para cualquier lista de objetos
		//añadir un número no se puede
		
		

	}
	
	

	
	public void print3(List<? super Number> lista3, Integer num3) {

		//intentamos meter un integer num en la lista lista3
		lista3.add(num3); //se pueden añadir números
		
		//deja porque super de Number es Objetc, y en Object se pueden meter números
		
		//super de Integer sería Number
		//Integer->Number->Object
		
		//el extends restringe
		//el super amplia

	}
	

}
