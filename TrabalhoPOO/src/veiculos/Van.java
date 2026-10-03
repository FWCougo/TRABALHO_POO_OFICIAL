package veiculos;

public class Van extends Veiculo{
	
	protected final float TARIFABASE = 8.00f;
	protected final float SEGUNDATARIFA = 3.00f;
	
    public Van() {
	}

    @Override public String getTipo() {
    	return "Van"; 
    	}
}

