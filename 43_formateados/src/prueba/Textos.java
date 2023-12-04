package prueba;

import java.util.Locale;
import java.util.ResourceBundle;

public class Textos {

	public static void main(String[] args) {
		
		//Por defecto es el español
		ResourceBundle rb= ResourceBundle.getBundle("textos");
		//ResourceBundle rb= ResourceBundle.getBundle("textos", Locale.ENGLISH);
		//si no está creado el fichero de traducción se verá el default
		
		//cambiar el idioma por defecto
		//Locale.setDefault(Locale.ENGLISH);
		
		System.out.println(rb.getString("t1"));
		
		System.out.println(rb.getString("t2"));

	}

}
