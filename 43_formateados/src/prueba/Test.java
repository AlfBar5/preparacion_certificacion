package prueba;

import java.sql.Date;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Test {

	public static void main(String[] args) {

		//Formatear salario a la visualización española
		double salario= 2345.45;
		Locale ld = new Locale("es", "ES");
		//Locale ld = new Locale("jp", "JP");
		NumberFormat nf=NumberFormat.getCurrencyInstance(ld);
		System.out.println(nf.format(salario));
		
		
		//Formatear fecha a la visualización española
		
		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL, ld);
		System.out.println(df.format(new Date(0)));
		
		

	}

}
