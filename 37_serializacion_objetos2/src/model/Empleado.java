package model;

import java.io.Serializable;

public class Empleado implements Serializable{
	
	private String codigo;

	//constructor sin campos
	public Empleado() {
	
	}
	
	//constructor con fields
	public Empleado(String codigo) {
		super();
		this.codigo = codigo;
	}

	
	//getter y setters
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
}





