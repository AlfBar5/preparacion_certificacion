package pruebas;

import java.util.ArrayList;
import java.util.List;

//Restricción de tipos a que los objetos solo sean de tipo Number
public class PilaNumber<T extends Number> {
	
	
	 	ArrayList<T> numeros;
	 	
	 	//T representa a cualquier objeto
	 	//ArrayList<T> almacen=new ArrayList();

	    //Constructor que crea una pila vacía
	    public PilaNumber() {
	    	numeros = new ArrayList<T>();
	    }

	    //Método que agrega un elemento a la pila
	    public void agregard(T numero) {
	    	numeros.add(numero);
	    }

	    //Método que elimina el último elemento de la pila
	    public T sacard() {
	        //Si la pila está vacía, devuelve null
	        if (numeros.isEmpty()) {
	            return null;
	        }
	        //Si no, devuelve y elimina el último elemento que ha entrado en la lista
	        else {
	            return numeros.remove(numeros.size() - 1);
	        }
	    }

	    
	    //Método que devuelve el total de elementos de la pila
	    public int totald() {
	        return numeros.size();
	    }
	    
	    //Método que devuelve la suma en tipo float de todos los números
	    public double sum() {
	    	double suma=0;
	    	for(T dato:numeros) {
	    		suma += dato.doubleValue();
	    	}
	    	
	    	return suma;
	    }



}
