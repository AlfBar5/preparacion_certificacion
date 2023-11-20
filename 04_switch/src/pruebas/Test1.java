package pruebas;

public class Test1 {

	public static void main(String[] args) {

		
		//no es un switch moderno, no devuelve valor. 
		//Es un switch clásico y no hace falta un default

		System.out.println("----- SWITCH CLÁSICO CON FLECHAS -----");
		
		Integer data=10;
		int n=2;
		
		switch(data/n){
			case 1,3->System.out.print("low ");
			case 4,5-> System.out.print("medium ");
			case 6,7,9-> System.out.print("high");
		}
		
		
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("------SWITCH CLÁSICO CON DOS PUNTOS -------");
		
		//con la flecha, entra y ya. Con dos puntos, entra y sigue
		switch(data/n){
		case 1,3: System.out.print("low ");
		case 4,5: System.out.print("medium ");
		case 6,7,9: System.out.print("high");
		}
		
		System.out.println(" ");
		System.out.println(" ");
		
		System.out.println("---- SWITCH JAVA 17------");
		
		double factura=30;
		int envio=5;
		int descuento=0;
		
		descuento=switch(envio) {
			 case 1,2,3->{
				 int op=envio*2;
				 yield op;
			 }
			 case 4,5->{
				 int op=envio*2+1;
				 yield op;
			 }
			 default->5;
		};
		
		System.out.println(factura*100/(100+descuento));
		
		
		System.out.println(" ");
		
		System.out.println("---- -- ------");
		
		//Error de compilación falta el default
		/*
		String cad="""a""";
		
				System.out.println(
						switch(cad.indent(1).length()){
							case 1->"simple";
							case 2,3->"normal";
							case 4->"optimal";
						}
						);
		
		
		*/
		
		System.out.println("----------------");
		
		
		



		final String str1="hello ";
		
		final String str2="""
				hello
				""";
		
		final String str3="""
				hello""";
		
		final String str4="hello by";
		
		switch(args[0]) {
			case str1:
				System.out.print(0);
			case str2:
				System.out.print(1);
			case str3:
				System.out.print(2);
			case str4:
				System.out.print(3);
			default:
				System.out.print(4);
		}
	



/*
And the execution command:
>java Test hello by
Which is the result?

a)	234
b)	1234
c)	01234
d)	4
e)	34
f)	compilations fails
		
*/	
		
		
		
		
		
		
		
		
		
		

	}

}
