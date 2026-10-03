package veiculos;

public class Carro extends Veiculo {
	
	protected final float TARIFABASE = 5.00f;
	protected final float SEGUNDATARIFA = 2.00f;
	
	public Carro() {}
	
	public Carro(String modelo) {
		super(modelo);
	}

	@Override
	public String getTipo() {
		return "Carro";
	}
	
	
	//...
	 @Override
	    protected float getTarifaBase() {
	        return 5.0f;
	    }
	    
	    @Override
	    protected float getSegundaTarifa() {
	        return 2.0f;
	    }

}