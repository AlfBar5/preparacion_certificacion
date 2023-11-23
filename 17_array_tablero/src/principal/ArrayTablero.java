package principal;

public class ArrayTablero {

	
	
	
	public static void main(String[] args) {

		//tablero 8x8
		String tablero[][]=new String[8][8]; 
		
		//rellenamos el array bidimensional: tablero
		for(int i=0;i<8;i++) {
			
			for(int k=0;k<8;k++) {
				
				tablero[i][k]=(i+k)%2==0?"B":"N";
				
			}
			
		}
		
		
		//recorremos y mostramos el array tablero
		//recorremos cada array
		for(String[] s:tablero) {
			for(String c:s) {
				System.out.print(c+"  ");
			}
			System.out.println(); //salto de linea
		}
		
		
		
		
		
		
		

	}

}
