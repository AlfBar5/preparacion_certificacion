package principal;

//PREGUNTA CASI SEGURA DE ENUMERACIONES + SWITCH 

//CUANDO ESTÁN TODAS LAS OPCIONES DE LA ENUMERACIÓN
//CONTEMPLADAS EN EL SWITCH
//NO HACE FALTA EL DEFAULT



public class Test1 {

	
	public static void main(String[] args) {
		
		enum Dias{LUNES,MARTES,MIERCOLES,JUEVES,VIERNES;}
		
		Dias d= Dias.JUEVES;

		String result=switch(d){
			case LUNES,MARTES,MIERCOLES->"pronto";
			case JUEVES->"correcto";
			case VIERNES->"tarde";
		};
		
		System.out.println(result);

		
		
		System.out.println("-------------");
		
		
		//si se le asignan valores a cada uno de sus elementos es obligatorio definir 
		//un constructor que reciba como parámetro estos valores
		
		enum Estados{
			 ON(2), OFF(1), UNKNOWN(4);
			 int s;
			 Estados(int k){s=k;}
			}
			for(var e:Estados.values()) {
			 System.out.println("Val: "+e.s+" Ordinal:"+e.ordinal());

			}
		
		
	}

}
