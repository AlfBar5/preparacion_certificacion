package pruebas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



class Alumno{
	private String name;
	private int age;
	
	public Alumno(String name, int age) {
		
	super();
		
		
	this.name = name;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			
	this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
	
}



public class TestOrdenacionListas  {
	
	
	public static void main(String[] args) {

		var lst=new ArrayList<Alumno>(List.of(new Alumno("Alf",27),
					new Alumno("Xion",19),
					new Alumno("Zote",31),
					new Alumno("Hater",22)));
			
		//mostrar nombres de los alumnos ordenados de
		//mayor a menor edad
		
		//ordeno la lista por Edad de menos a más edad
		lst.sort((a,b)->a.getAge()-b.getAge());
		
		//otra forma de mayor a menor edad
		lst.sort((a,b)->Integer.compare(b.getAge(), a.getAge()));
		
		// otra forma, inversa con reversed
		lst.sort(Comparator.comparingInt((Alumno a)->a.getAge()).reversed());
		

		lst.forEach(a->System.out.println(a.getName()+" "+a.getAge()));
		
	}

	

}
