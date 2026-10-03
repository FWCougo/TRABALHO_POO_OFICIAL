package veiculos;

public class Carro extends Veiculo {
	
	private final float TARIFABASE = 5.00f;
	private final float SEGUNDATARIFA = 2.00f;
	
	public Carro() {}
	
	public Carro(String modelo) {
		super(modelo);
	}

	@Override
	public String getTipo() {
		return "Carro";
	}

}