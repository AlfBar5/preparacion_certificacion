package pruebas;

public class TestStringBuilder {

	public static void main(String[] args) {
		
		//Representa cadenas de caracteres mutables, se pueden 
		//modificar a través de los métodos de la clase 
		//Los métodos operan sobre el propio objeto 
		//Se crean:
		
		StringBuilder sb=new StringBuilder("cadena mutable");
		
		/*StringBuilder sb1=new StringBuilder("hello");
		StringBuilder sb2=new StringBuilder("by");
		//StringBuilder sb3=sb1+sb2; //no
		StringBuilder s3=new StringBuilder(sb1+" "+sb2);*/
		
		StringBuilder sb1=new StringBuilder("hello");
		StringBuilder sb2=new StringBuilder("hello");
		System.out.println(sb1==sb2);//false
		System.out.println(sb1.equals(sb2));//false
		
		System.out.println("------------------");
		
		// a partir de java 11, se pueden comparar dos Stringbuilder con compareTo
		
		System.out.println(sb1.compareTo(sb2)); //da 1 o 0
		//Si son iguales da 0 (true)
		
		
		System.out.println("------------------");
		
		StringBuilder aa=new StringBuilder("hello by");
		String bb="hello";
		//false, comparamos un objeto string (b) con otro diferente de tipo StringBuilder (a)
		System.out.println(bb.equals(aa.delete(5, 8))); 
		
		System.out.println("------------------");
		
		//True, porque ahora hemos pasado el StringBuilder a String, y son dos String iguales
		System.out.println(bb.equals(aa.delete(5, 8).toString()));
		
		System.out.println("------------------");
		
		//Si le damos un número, java asigna un número de caracteres
		StringBuilder w=new StringBuilder(50);
		//no hay cadena de caracteres aún, da 0
		System.out.println(w.length());
		
		
		System.out.println("------------------");
		
		String a ="cadena";
		String b= a.toLowerCase();
		String c=a.trim();
		StringBuilder sbb= new StringBuilder(a);
		String d =a;
		String ee="cadena"; //Mismo objeto, java aprovecha el mismo pool
		//los métodos generarian un nuevo objeto, pero si el resultado es idéntico al original
		//no genera un nuevo objeto, reutiliza el mismo que está en el pool
		System.out.println(a==b); //true
		System.out.println(a==c); //true
		System.out.println(a==d); //true
		System.out.println(a==ee); //true
		System.out.println(a==sbb.toString()); //no es el mismo objeto, false
		
		
		System.out.println("------------------");
		
		String aaa="cadena";
		String bbb="CADENA";
		//false. Java, construye otro objeto bbb. Por debajo hace un new objeto distinto a bbb
		System.out.println(aaa==bbb.toLowerCase()); 
		
		
		//La asignación al pool lo hace la máquina virtual java
		//el compilador solo mira si la sintaxis de la programación está bien.
		
		System.out.println("------------------");
		
		//False, no son el mismo objeto. Aunque ahora da true por ser objetos vacios?
		//Chat GPT responde: Es posible que tengas razón. En Java, las cadenas vacías se almacenan en un pool de cadenas y se reutilizan en lugar de crear nuevas instancias de cadenas vacías. Por lo tanto, cuando se compara una cadena vacía con otra cadena vacía, Java puede comparar las referencias de objeto en lugar de los valores de cadena. Esto puede explicar por qué la expresión ssss==p.trim() se evalúa como true en tu compilación.
		
		String ssss="";
		StringBuilder aaaa= new StringBuilder("alt ");
		String p=aaaa.delete(0,3).toString();
		System.out.println(p.isBlank()?ssss==p.trim():ssss==p);
		
		//comprobamos si tienen el mismo hashcode
		System.out.println(ssss.hashCode());
		System.out.println(p.hashCode());
		
		
		
	}

}
