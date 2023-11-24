package principal;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.Carrera;


public class TestJson {

	public static void main(String[] args) {
		// leer los datos del pedido que se encuentra en c:/temp/pedidos.json
		
		//ayuda oficial de gson: https://javadoc.io/doc/com.google.code.gson/gson/latest/com.google.gson/com/google/gson/Gson.html
		
		String ruta="c:\\temp\\competicion-natacion.json";
		
		//devuelve el javabean con los datos metidos dentro
		//	fromJson​(String json, Class<T> classOfT)
		// primer parámetro: ruta del fichero
		// segundo parámetro : tipo de objeto al que quiero convertir el json (Pedido).
		//Se le dice con la clase Class (contiene información de clases java, metadatos)
		Gson gson =new Gson();
		
		
		
				
		
		//PARA UN PRODUCTO SOLO
		//poner atriburos de json distinguiendo may y minusculas igual que el model
		
		/*
		try(FileReader reader = new FileReader(ruta);)
		{
			Pedido pedido=gson.fromJson(reader, Pedido.class);
			System.out.println("Producto: "+pedido.getProducto());
			System.out.println("Fecha pedido: "+pedido.getFechaPedido());
			System.out.println("Precio: "+pedido.getPrecio());
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		
		*/
		
		
			
		// código común a los otros métodos lo metemos en un método private
		
		
			try(FileReader reader = new FileReader(ruta);)
			{
				
				System.out.println("--------------- leer json ----------- ");
								
				Carrera[] carreras=gson.fromJson(reader, Carrera[].class);
				ArrayList<Double> tiempos=new ArrayList<>();
				
				for(Carrera c:carreras) {
					System.out.println(c.getNadador()+" "+c.getTiempo());;
					tiempos.add(c.getTiempo());
				}
				
				
				System.out.println("--------------- tiempos ----------- ");
				

				for(double t:tiempos){
					System.out.println(t);
				}
				
				

				System.out.println("--------------- ordenar tiempos ----------- ");
				
				tiempos.sort((a,b) -> a>b?1:-1);
				for(double t:tiempos){
					System.out.println(t);
				}
				
				
				System.out.println("--------------- meter nuevo tiempo ----------- ");
				
				Double nt = 3.38;
				tiempos.add(nt);
				
				
				
				System.out.println("--------------- ordenar  con nuevo tiempo tiempos ----------- ");
				
				tiempos.sort((a,b) -> a>b?1:-1);
				for(Double t:tiempos){
					System.out.println(t);
				}
				
				
				
				
				
				System.out.println("--------------- posicion nuevo tiempo ----------- ");
				
				//array vacio de objetos 
				
				Object[] posiciones = tiempos.toArray();
				Double valor =3.38;
				
				int resultado= Arrays.binarySearch(posiciones, valor);
				
				resultado = resultado +1;
				
				System.out.println("Posición del tiempo "+valor+": "+resultado+ " puesto");
				
				
				
			}catch(IOException ex) {
				ex.printStackTrace();
				
			}
		}
	
	
	
}

