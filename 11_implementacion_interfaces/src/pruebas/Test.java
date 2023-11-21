package pruebas;

interface I1{
	default void m() {
		
	}
	
}

interface I2{
	default void m() {
		
	}
	
}


public class Test implements I1,I2 {

	//Las dos interfaces tienen el mismo método
	//Solución: sobreescribir el método
	@Override	
	public void m() {
		I2.super.m();
	}
	
	

}
