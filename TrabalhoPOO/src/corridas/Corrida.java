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
	
	public Corrida(float dist) {
		this.distancia = dist;
	}	
	public Corrida(Passageiro passageiro) {
		this.passageiro = passageiro;
	}	

	//Getter e Setter
	public float getDistancia() {
	       return this.distancia;
	}		
	public void SetPassageiro(Passageiro p) {
		this.passageiro = p; 
	}
	public String GetPassageiro() {
		return passageiro.getNome();
	}
	
	
	
	
	
	public void AvaliarCorrida() {
		motorista.ReceberNota(0);
	}
	
	@Override
	public String toString() {
		return "Corrida";
	}
}
