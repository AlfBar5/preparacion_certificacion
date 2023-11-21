package p1;

public class C1 {
	
	int x;
	
	
	//Tiene que haber un constructor sin parámetros para que C2 pueda heredar C1
	//Es OBLIGATORIO
	public C1() {
		x++;
	}
	
	public C1(int a) {
		
		System.out.println("C1");
		
	}

}
