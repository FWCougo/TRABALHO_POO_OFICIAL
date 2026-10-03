package corridas;

import pessoas.*;

import java.util.Date;

import miscelaneos.*;

public class Corrida {
	private Passageiro passageiro;
	private Endereco origem;
	private Endereco destino;
	private float distancia;
	private Motorista motorista;
	private Date data;	
	
	public Corrida(float distancia) {
	    this.distancia = distancia;
	}
	
	public float getDistancia() {
	       return this.distancia;
	}
	
	
	public void AvaliarCorrida() {
		motorista.ReceberNota(0);
	}
	
}
