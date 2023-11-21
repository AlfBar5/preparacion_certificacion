package geometria;

public  non-sealed class Circulo extends Figura {
	private int radio;
	
	
	//constructor
	public Circulo(String color, int radio) {
		super(color);
		this.radio = radio;
	}



	@Override
	public double superficie() {
		
		// los dos valen
		return Math.PI*radio*radio;
		//return Math.PI*Math.pow(radio, 2);
	}

}
