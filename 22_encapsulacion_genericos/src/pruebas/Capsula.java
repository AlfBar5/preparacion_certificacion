package pruebas;


public class Capsula<T> {
	
	  // El atributo que almacena el objeto, como es genérico no es de ningún tipo
	  T contenido;

	  // El constructor que recibe el objeto
	  public Capsula(T contenido) {
	    this.contenido = contenido;
	  }

	  // El método que devuelve el objeto
	  public T getContenido() {
	    return contenido;
	  }

	  // El método que cambia el objeto
	  public void setContenido(T contenido) {
	    this.contenido = contenido;
	  }
	
	
	 //método isNull() que devolverá true si el objeto encapsulado es nulo
	  public boolean isNull() {
		  
		  return contenido==null;
	  }
	

}
