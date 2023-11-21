package p2;


import p1.C1;

public class C2 extends C1 {

	public C2(){
		// compila porque lo estamos llamando en el contexto de la herencia de clase
		// con super
		super();
	}
	
	public static void main(String[] args) {

		//Error de compilación, no se pueden instacias objetos protected directamente
		//C1 c = new C1()
		
		// esto si está permitido. La instanciamos con la clase hija
		//que se instancia a sí misma
		C1 c = new C2();
		

	}

}
