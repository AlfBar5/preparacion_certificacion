package principal;


enum Option{
	ONE(1), TWO(2), THREE(3);
 	int r;
	Option(int r){
		this.r=r;
	}
}
record Process(Option... ops){
	
}



public class Course {

	public static void main(String[] args) {

		Process p1=new Process(Option.ONE);
		Process p2=new Process(Option.TWO);
		System.out.print(p1==p2);
		System.out.print(p1.ops()[0]);
		System.out.print(p2.ops()[0]);

	}

}
