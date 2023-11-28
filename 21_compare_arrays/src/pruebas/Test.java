package pruebas;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		int[] a1 = {4,5,1,2,7,9};
		int[] a2 = {4,5,0};
		
		System.out.println(Arrays.compare(a1, a2));
		
		System.out.println("---------------");

		
		char[] b1 = {'a','b','c','d','e','f'};
		char[] b2 = {'a','b','c','f'};
		
		System.out.println(Arrays.compare(b1, b2));
		
		
	}

}
