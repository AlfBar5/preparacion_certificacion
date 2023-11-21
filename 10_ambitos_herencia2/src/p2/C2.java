package p2;


import p1.C1;

public class C2 extends C1 {

		int x;
		int y =10;
		
		public C2(int b) {
			super(); //en la superclase TIENE QUE haber un constructor sin parámetros
			
			x++;
			
			System.out.println("C2");
			
			
			
		}
	
	
		
	public static void main(String[] args) {

		
		C1 c = new C2(4);
		
		C2 d= new C2(3);
		System.out.println(d.x); // se incrementa la x local de C2 en 1

		// EN HERENCIA
		//No se puede acceder a un atributo o método del hijo que no ESTÉ YA PRESENTE EN EL PADRE

		//CASTING de clase C1 a C2, para poder acceder al atributo y (que solo está en C2)
		//convertimos algo grande en algo más pequeño
		System.out.println(((C2)c).y); 
		
	}

}
