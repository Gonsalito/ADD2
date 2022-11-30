package Ficheros_Binarios;

public class Punto {

	int coordx;
	int coordy;
	String color;
	
	
	public Punto(int coordx, int coordy, String color) {
		super();
		this.coordx = coordx;
		this.coordy = coordy;
		this.color = color;
	}
	public int getCoordx() {
		return coordx;
	}
	public void setCoordx(int coordx) {
		this.coordx = coordx;
	}
	public int getCoordy() {
		return coordy;
	}
	public void setCoordy(int coordy) {
		this.coordy = coordy;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Punto [coordx=" + coordx + ", coordy=" + coordy + ", color=" + color + "]";
	}
	
	
}
