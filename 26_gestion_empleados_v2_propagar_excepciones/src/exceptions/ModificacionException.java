package exceptions;

//la clase debe heredar la superclase de todas las excepciones java
public class ModificacionException extends Exception {

	String message;
	
	
	public ModificacionException(String message) {
		super();
		this.message = message;
	}



	@Override
	public String getMessage() {
		return message; 
	}
	
	
	

}
