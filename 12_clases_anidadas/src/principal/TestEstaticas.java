package principal;

//CLASES ANIDADAS
//Ejemplo 2. Clases estáticas
//Es cuando dentro de una clase declaramos otra clase

class Externa{
	
	static int k=10;
	static class Interna{

		public void print() {
			System.out.println(k);
			//s++ // no es estático, error de compilación
		}
		
	}
	
}




public class TestEstaticas {
	
	
	
	public static void main(String[] args) {
		
		Externa.Interna in = new Externa.Interna();
		in.print();
		
	}
	
	

}
