package principal;


enum Direction{
	X(10),Y(20), Z(30);
	int inc;
	Direction(int inc) {
		this.inc=inc;
	}
	public void change(int s) {
		inc+=s;
	}
}



public class Test2 {

	public static void main(String[] args) {
		
		// suma 10 a 10, resultado 20
		var ob=Direction.X;
		ob.change(10);
		System.out.println(ob.inc);

	}

}
