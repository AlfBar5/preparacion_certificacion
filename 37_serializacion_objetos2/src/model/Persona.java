package model;

import java.io.Serializable;




//La clase Persona hereda de la superclase Empleado

//La clase persona tiene que implementar la interfaz Serializable
//para que se pueda guardar el objeto Persona en un fichero

//Todos los atributos de la clase tienen que ser serializables (o transient)

public class Persona implements Serializable{

	private String nombre;
	private String dni;
	//private int edad;
	
	////si queremos que un campo del javabean no se serialice, 
	////tenemos que declararlo con la palabra transient
	private transient int edad;
	
	//atributo de tipo Empleado
	private transient Empleado emp;
	
	//constructor sin campos
	public Persona() {
		
	}
	
	//constructor con fields 
	public Persona(String nombre, String dni, int edad, Empleado emp) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.emp = emp;
	}
	
	
	
	//getter y setters
	public String getNombre() {
		return nombre;
	}	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Empleado getEmp() {
		return emp;
	}

	
	public void setEmp(Empleado emp) {
		this.emp = emp;
	}
	
	
	
	
}
