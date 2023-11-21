package principal;


record Persona(String nombre, int edad) {
	
	
	//Constructor compacto, sin () Se usa para hacer comprobaciones
	Persona{
		if(edad<0) {
			edad=18;
		}
	}
	
	
	//constructor canónico. Tiene que inicializar sí o sí todos los atributos
	//Para inicializar por defecto
	Persona(){
		//this.nombre= "Juan"; //error
		//this.edad = 24; //error
		this("Juan",30); //llamamos al constructor canonico Persona(String nombre, int edad)
	}
	
	//método en el record
	public void print() {
		System.out.println(this.nombre);
	}
	
}


public class Test1 {
	

	public static void main(String[] args) {
		
		var r = new Persona("pepe", 23);
		
		r.print();

	}

}
