
class C1{}
interface I1{}
class C2 extends C1 implements I1{}
interface I2{}
class C3{}

public class Test1 {

	public static void main(String[] args) {


		C1 c = new C2();
		System.out.println(c instanceof C2); //true
		System.out.println(c instanceof I1); //true
		System.out.println(c instanceof I2); //false La clase no implementa esa interfaz
		//System.out.println(c instanceof C3); //Error de compilazacion. No hay relación de herencia entre las dos clases
		
		//si hay relación de herencia, se puede preguntar
		//si no hay relación de herencia entre clases da error de compilación
		
		Number n=2.3;
		System.err.println(n instanceof Object); //true
		System.err.println(n instanceof Integer); //false. Double e integer heredan de number
		//System.err.println(n instanceof String); //Error de compilación
		
		//Da error de compilación porque String y Double son clases que no heredan una de otra y no tienen padre común
		//Con interfaces puedes preguntar por cualquiera, dará true o false, pero no error de compilación
		
	}

}
