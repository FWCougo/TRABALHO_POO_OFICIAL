package corridas;

import pessoas.*;

import java.util.Date;

import miscelaneos.*;

public abstract class Corrida {
	private Passageiro passageiro;
	private Endereco origem;
	private Endereco destino;
	private float distancia;
	private Motorista motorista;
	private Date data;	
	private int estado;
	
	public Corrida(float distancia) {
	    this.distancia = distancia;
	    estado=1;
	}
	
	public float getDistancia() {
	       return this.distancia;
	}	
	
	public void AvaliarCorrida() {
		motorista.ReceberNota(0);
	}
	
	public int GetEstado() {
		return this.estado;
	}
	
	@Override
	public String toString() {
		return "Corrida";
	}
}
