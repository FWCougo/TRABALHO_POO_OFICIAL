package veiculos;

public class Van extends Veiculo{
	
	private final float TARIFABASE = 8.00f;
	private final float SEGUNDATARIFA = 3.00f;
	
    public Van() {
	}

    @Override public String getTipo() {
    	return "Van"; 
    	}
}

