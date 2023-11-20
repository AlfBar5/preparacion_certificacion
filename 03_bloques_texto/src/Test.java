
public class Test {

	public static void main(String[] args) {


		String cadena1="""
				hello
				by
				""";
		
		System.out.println(cadena1.length());
		//da 9, 7 caracteres y dos saltos de línea
		
		System.out.println(cadena1);
		
		System.out.println("---------------");
		
		String cadena2="""
				select * from
				Empleados
				Where nombre="paco"
				""";
		
		System.out.println(cadena2);
		
		
		System.out.println("----- anulando saltos de línea-------");

		//la barra anula el salto de línea
		String cadena3="""
				select * from \
				Empleados \
				Where nombre="paco"
				""";
		
		System.out.println(cadena3);
		
		
		System.out.println("----- En bloques de texto multilínea, los espacios antes del salto de línea son eliminados automáticamente, a no ser que se indiquen explícitamente-------");

				//la barra anula el salto de línea
				String cadena4="""
						select * from \s
						Empleados \s
						Where nombre="paco"
						""";
				
				System.out.println(cadena4);
				
				

//What will the following code print?
		String str1="""
				Hello \
				world""";
		String str2="Hello world";
		StringBuilder str3=new StringBuilder(str2); //se construye otro objeto
		System.out.print(str1==str2);  //true, mismo literal, mismo objeto
		System.out.print(str1.equals(str2)); //true, mismo literal, mismo objeto
		System.out.print(str3.equals(str1)); //false, no es el mimsmo obeto
/*
a)	falsefalsefalse
b)	truefalsefalse
c)	truetruefalse ---> CORRECTO
d)	truetruetrue
e)	falsefalsetrue
*/

		
		
		
		
		
		
	}

}
