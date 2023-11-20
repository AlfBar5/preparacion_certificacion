package pruebas;

public class TestMetodos1 {

	public static void main(String[] args) {

		//False el trim me genera un nuevo objeto String y no es el mismo objeto, aunque tenga el mismo contenido
		String cad="hello ";
		String b="hello";
		System.out.println(b==cad.trim());
		
		//Daría False, el toUpper no hace ningún cambio al objeto x, genera un nuevo objeto, x permanece inmutable
		//Con LocalDate pasa lo mismo con sus métodos
		//no hay excepciones ni con String, Integer, y LocalDate
		String x="car";
		x.toUpperCase();
		System.out.println(x.equals("CAR"));
		
	}

}
