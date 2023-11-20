package principal;

public class Test2 {
	
	
	public static void main(String[] args) {
		Integer integ=20;
		print(integ);
		//1. Coincidencia exacta
		//2. Promoción a superclase o interfaz directa
		//3. Interfaz implementada (por superclase)
		//4. promoción a superclases superiores
		//5. Varargs
	}
	
	private static void print(Object ob) {
		System.out.println("Object");
	}
	/*
	private static void print(Serializable ob) {
		System.out.println("Serializable");
	}
	*/
	private static void print(Number ob) {
		System.out.println("Number");
	}
	/*private static void print(Integer ob) {
		System.out.println("Integer");
	}*/
	private static void print(Integer ...integers ) {
		System.out.println("varargs");
	}
	
	

}
