package principal;

import java.io.Serializable;

//CLASES ANIDADAS
//ejemplo 1: Clases estándar. 
//Se definen como un miembro estático de la clase externa

class Externa2{
	static int n=5;
	int p=1;
	class Interna2{
		
		public void print() {
			System.out.println(n+"-"+p);
		}
	}
}


public class TestEstandares {

	
	public static void main(String[] args) {
		
		//Creamos un objeto de la clase
		//primero se crea un objeto de la clase externa
		Externa2.Interna2 in = (new Externa2()).new Interna2();
		
		//llamamos al método print
		in.print();
		
	}

	
	
	
	
}
