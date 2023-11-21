package pruebas;


interface I11{
	void m(); //método abstacto
}

interface I22 extends I11{
	default void m(int a) {	}
	void k();
}

class C1{
	void p() { }
}


class A extends C1 implements I22{

	public void m(int p) { } //sobreescritura
	
	public void k(int s) { } //sobrecarga
	
	public int k(String g) { return 0; } //Sobrecarga
	
	public void k() { } //sobreescritura
	
	//public int p() { } // error. Se cambia el tipo de devolución a int cuando es void
	
	//void m() { } //error hay que cambiar el método a public. No podemos reducir el ámbito
	
	public int p(String s) { return 0; } //sobrecarga
	
	public void p() { } //sobreescritura

	
	
	@Override
	public void m() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}


public class Test2 {

}
