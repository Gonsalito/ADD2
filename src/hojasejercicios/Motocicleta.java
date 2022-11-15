package hojasejercicios;

import java.awt.Color;

public class Motocicleta extends Vehiculo {
	
	int numeroPlazas;

	public Motocicleta() {
		
	}

	public Motocicleta(int numRuedas, int cilindrada, int potencia, Color color, int numeroPlazas) {
		super(numRuedas, cilindrada, potencia, color);
		this.numeroPlazas = numeroPlazas;
		
	}

	public int getNumeroPlazas() {
		return numeroPlazas;
	}

	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
	} 
	
	
	

}
