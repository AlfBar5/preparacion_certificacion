package service;

import utilities.Utilidades;

public class Operaciones {

	//dos atributos
	private int n1,n2;
	
	//un constructor que permite incializar los atributos
	public Operaciones(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	
	}
	
	//métodos
	public int sumar() {
		return n1+n2;
	}
	
	
	//métodos
	public int restar() {
		return Utilidades.mayor(n2, n1)-Utilidades.menor(n2, n1);
	}
		
		
	//métodos
	public int multiplicar() {
		return n1*n2;
	}
		
		
	//métodos
	public int dividir() {
		return Utilidades.mayor(n2, n1)/Utilidades.menor(n2, n1);
	}
	
	
	
}
