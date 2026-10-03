package veiculos;

public class Moto extends Veiculo {
	
	final float TARIFABASE = 3.00f;
	final float SEGUNDATARIFA = 1.50f;
	
	
    public Moto() {
    	}
    public Moto(String modelo) {
    	super(modelo); 
    	}
    @Override public String getTipo() {
    	return "Moto"; 
    	}

}