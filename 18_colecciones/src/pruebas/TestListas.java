package pruebas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestListas {

	public static void main(String[] args) {

		List<Integer> lst= new ArrayList<>(List.of(2,5,7,7,1));
		System.out.println(lst.remove(2)); // remove(int index) le pasamos un índice, elimina posición 2, el 7 y lo devuelve
		System.out.println(lst.get(0)); // devuelve 2

		
		System.out.println("------- HashMap 1 ------");
		
		var map= new HashMap<Integer,String>();
		//
		map.put(100,"Hello");
		//machaca hello con by (tienen la misma clave) y devuelve el elemento anterior "hello"
		System.out.println(map.put(100,"by")); 
		
		
		

		System.out.println("------- HashMap 2 ------");
		
		var map2= new HashMap<Integer,String>(Map.ofEntries(Map.entry(100, "a"),
							Map.entry(200, "b"),
							Map.entry(300, "c")
				));
		System.out.println(map2.get(300)); 
		
		
		
		
		
		
	}

}
