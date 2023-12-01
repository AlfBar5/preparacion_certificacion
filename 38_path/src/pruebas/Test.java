package pruebas;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

	public static void main(String[] args) {

		//Path relativize(Path other). 
		//Devuelve la ruta relativa de other respecto al path principal:

		Path p1=Path.of("c:\\temp\\mydata.txt");
		Path p2=Paths.get("c:\\temp\\..\\data.txt"); //no normaliza y trata a .. como si fuese un directorio real
		System.out.println(p1.relativize(p2)); //..\..\data.txt
		
		//resulta:
		// ..\..\data.txt
		
		
		Path p3=Path.of("c:\\temp\\mydata.txt");
		Path p4=Paths.get("c:\\temp\\beans\\data.txt");
		System.out.println(p3.relativize(p4)); //..\beans\data.tx 
		
		//subo a temp, bajo a beans
		
		
		
		
		//Path resolve (Path other). Resuelve la ruta de other frente a la principal 
		Path p5=Paths.get("c:\\temp\\..\\data.txt"); 
		Path p6=Paths.get("new.txt");
		System.out.println(p5.resolve(p6)); //c:\temp\..\data.txt\new.txt 
		
		
		
		
		
		
		//int getNameCount(). Devuelve el número de elementos del path, sin incluir el raíz 
				 		 
		Path p7=Path.of("c:\\temp\\..\\mydata.txt");
		System.out.println(p7.getNameCount()); //3
		System.out.println(p7.normalize().getNameCount()); //1
		
		
		
		
		
		
		
		
	}

}
