
public class TestPattern {

	public static void main(String[] args) {

		
		
		//Desde Java 16 se puede utilizar instanceof para asignar el 
		//objeto a una variable del tipo específico, sin realizar un cast: 
		
		
		//antes de java 16 pregunta instanceof y conversión con cast (String) y asignación en dos pasos

		Object obj=new String("Mi cadena");
		if(obj instanceof String) {
			String s=(String)obj;
			System.out.println("Longitud: "+s.length());
		}


		System.out.println("-----------------");

		// Desde Java 16 se convierte y se asigna directamente a la variable

		Object obj2=new String("Mi cadena");
		if(obj2 instanceof String s2) {
			System.out.println("Longitud: "+s2.length());
		}
		
		System.out.println("-----------------");
		
		Object a = 4.5; 
		if(a instanceof Number n) {
			System.out.println("Number");
			if(a instanceof Double) {
				System.out.println("Double");
			}else {
				System.out.println("no double");
			}
		}
		
		System.out.println("-----------------");
		
		// Desde Java 16 se convierte y se asigna directamente a la variable n2
		Object a2 = 4.5; 
		if(a2 instanceof Number n2) {
			System.out.println("Number");
			if(n2 instanceof Double) {
				System.out.println("Double");
			}else {
				System.out.println("no double");
			}
		}
		
		

	}

}
