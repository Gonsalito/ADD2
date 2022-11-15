package hojasejercicios;


import java.awt.Color;


public class Vehiculo {
	
	int numRuedas;
	int cilindrada;
	int potencia;	
	Color color;
	
	//CONSTRUCTOR
	public Vehiculo() {
		numRuedas  = 4;
		cilindrada = 80;
		potencia = 80;
	}
	

		public Vehiculo(int numRuedas, int cilindrada, int potencia, Color color) {
		super();
		this.numRuedas = numRuedas;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
		this.color = color;
	}


		public int getNumRuedas() {
			return numRuedas;
		}
	
		public void setNumRuedas(int numRuedas) {
			this.numRuedas = numRuedas;
		}
	
		public int getCilindrada() {
			return cilindrada;
		}
	
		public void setCilindrada(int cilindrada) {
			this.cilindrada = cilindrada;
		}
	
		public int getPotencia() {
			return potencia;
		}
	
		public void setPotencia(int potencia) {
			this.potencia = potencia;
		}
	
		public Color getColor() {
			return color;
		}
	
		public void setColor(Color color) {
			this.color = color;
		}


	
	
}
