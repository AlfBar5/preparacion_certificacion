package principal;

class A{
	
}
interface I{
	
}
class B extends A implements I{
	
}



public class Test3 {

	public static void main(String[] args) {

		B b=new B();
		print(b);
	}
	
	
	
	private static void print(A a) {
		System.out.println("A");
	}
	/*private static void print(I a) {
		System.out.println("I");
	}
	private static void print(B a) {
		System.out.println("B");
	}*/
		
		

	

}
