package principal;

import principal.Externa2.Interna2;

class Externa3{
	static int n=2;
	int p=10;
	public void pr() {
		//definimos un atriburo y la clase dentro del método
		int w=1; //solo se pueden acceder a las variables del método si se tratan como constantes, no se pueden variar
		// w++; // con esta instrucción da error
		class Interna3 {
			//con sus atributos y sus métodos
			int s=1;
			public void print() {
				System.out.println(n+" - "+p+" - "+w+" - "+s);
			}
					
		}
		
		//Creamos un objeto de la clase. Unicamente se puede en el interior del método
		Interna3 inter=new Interna3();
		inter.print();
		
		
	}
	
}


public class TestInternaMetodo {

	public static void main(String[] args) {
		
		Externa3 exter = new Externa3();
		//System.out.println(exter);
		
		

	}
	


	
	

}
