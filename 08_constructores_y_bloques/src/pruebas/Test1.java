

package pruebas;

public class Test1 {
	
	int x;
	static int y;
	{//bloque de inicialización de instancia, después pasa por aquí
		x++;
		y++;
	}
	static {//bloque estático, primero pasa por aquí. Por aquí pasa una vez nada más
		y++;
	}
	Test1(){//constructor, por último lugar pasa por aquí
		x++;
	}

	public static void main(String[] args) {
		Test1 t1=new Test1();
		System.out.println(t1.y+"-"+t1.x);//2-2
		Test1 t2=new Test1();
		System.out.println(t1.y+"-"+t1.x);//3-2

	}

} 