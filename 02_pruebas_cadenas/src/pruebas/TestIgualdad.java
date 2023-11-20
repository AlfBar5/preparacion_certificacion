package pruebas;

public class TestIgualdad {

	public static void main(String[] args) {
		
		
		String a="hello";
		String b="hello";
		String c=new String("by");
		String d=new String("by");
		System.out.println(a==b); //true //ambas variables están apuntando al mismo objeto
		System.out.println(c==d); //false

	}

}
