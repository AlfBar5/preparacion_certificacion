package pruebas;

import java.util.ArrayList;
import java.util.List;

public class Pila<T> {
	
	
	 	ArrayList<T> elementos;
	 	
	 	//T representa a cualquier objeto
	 	//ArrayList<T> almacen=new ArrayList();

	    //Constructor que crea una pila vacía
	    public Pila() {
	        elementos = new ArrayList<T>();
	    }

	    //Método que agrega un elemento a la pila
	    public void agregar(T elemento) {
	        elementos.add(elemento);
	    }

	    //Método que elimina el último elemento de la pila
	    public T sacar() {
	        //Si la pila está vacía, devuelve null
	        if (elementos.isEmpty()) {
	            return null;
	        }
	        //Si no, devuelve y elimina el último elemento que ha entrado en la lista
	        else {
	            return elementos.remove(elementos.size() - 1);
	        }
	    }

	    
	    //Método que devuelve el total de elementos de la pila
	    public int total() {
	        return elementos.size();
	    }
	    
	 



}
