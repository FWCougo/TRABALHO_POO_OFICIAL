package veiculos;

public class Carro extends Veiculo {
	
	final float TARIFABASE = 5.00f;
	final float SEGUNDATARIFA = 2.00f;
	
	public Carro() {}
	
	public Carro(String modelo) {
		super(modelo);
	}

	@Override
	public String getTipo() {
		return "Carro";
	}

}