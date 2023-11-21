package principal;



class A{
	private static int c=2;
	static void m(){
		System.out.println(c); //1
	}
	static class B{
		void print(){
			c++; //2
			m(); //3
		}
	}
}





public class TestEstatica2 {

	public static void main(String[] args) {
		
		
		A.B obj=new A.B();
		obj.print(); //4

	}

}

/*

a.- muestra 3  ---- CORRECTA
b.- muestra 2
c.- error de compilación en l1
d.- error de compilación en l2
e.- error de compilación en l3
f.- error de compilación en l4

*/






