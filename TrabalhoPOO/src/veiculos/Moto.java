package veiculos;

public class Moto extends Veiculo {	
	
    public Moto() {
    	}
    public Moto(String modelo) {
    	super(modelo); 
    	}
    @Override public String getTipo() {
    	return "Moto"; 
    	}

    //....
    @Override
    public float getTarifaBase() {
        return 3.0f;
    }
    
    @Override
    public float getSegundaTarifa() {
        return 2.5f;
    }
    
}