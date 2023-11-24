package pruebas;


import java.util.Arrays;
import java.util.Comparator;

public class TestBinarySearch {

	public static void main(String[] args) {
		
		
		int[] n = {7,1,8,3,2};
		String[] m = {"abc", "ab", "xys", "v"};
			
		Comparator<String> cmp=(a,b)->Integer.compare(a.length(), b.length());
		
		String[] x=m;
		Arrays.sort(x,cmp);	 //ordenación por longuitud de la cadena	
		
		//int binarySearch(tipo[] array, tipo valor). Devuelve la posición del valor dentro 
		//del array, que previamente debe estar ordenado 
		//Consideraciones sobre el método: 
		//Si el array no está ordenado, el resultado es impredecible 
		
		System.out.println(Arrays.binarySearch(n,3)); // impredecible, n no está ordenado
		System.out.println(Arrays.binarySearch(n,11)); // impredecible, n no está ordenado
		System.out.println(Arrays.binarySearch(x,"ab", cmp)); // da 1, está ordenado alfabéticamente
		System.out.println(Arrays.binarySearch(m, "myclass",cmp)); // -5 devuelve -pIns-1. Donde pIns es la posición que le correspondería al elemento
		

	}

}
