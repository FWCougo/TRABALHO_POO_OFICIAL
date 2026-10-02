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

}