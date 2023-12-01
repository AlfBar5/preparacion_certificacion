package prueba;

public class Test1 {

	public static void main(String[] args) {

		Runnable r1=()->System.out.print("hello,");
		Runnable r2=()->System.out.print("by,");
		Thread t1=new Thread(r1);
		t1.start();
		t1=new Thread(r2);
		t1.start();
		System.out.println("tomorrow,");
		t1.start();  //no se puede llamar a start dos veces sobre el mismo hilo
		
		//EXCEPCION

	}

}
