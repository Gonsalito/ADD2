package hojasejercicios;

import java.awt.Color;

public class Camion extends Vehiculo {

	
	int numeroEjes;

	public Camion() {
		
	}

	public Camion(int numRuedas, int cilindrada, int potencia, Color color, int numeroEjes) {
		super(numRuedas, cilindrada, potencia, color);
		this.numeroEjes = numeroEjes;
	}

	public int getNumeroEjes() {
		return numeroEjes;
	}

	public void setNumeroEjes(int numeroEjes) {
		this.numeroEjes = numeroEjes;
	} 
	
	
	
}
