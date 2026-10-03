package veiculos;

public class Van extends Veiculo{
	
	final float TARIFABASE = 8.00f;
	final float SEGUNDATARIFA = 3.00f;
    public Van() {
	}

    @Override public String getTipo() {
    	return "Van"; 
    	}
}
