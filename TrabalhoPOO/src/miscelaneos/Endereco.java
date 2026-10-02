package miscelaneos;

public class Endereco {
	private String rua;
	private String numero;
	private String bairro;
	private String cidade;
	
	public Endereco(String rua, String numero, String bairro, String cidade) {
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
	}
	
	@Override
	public String toString() {
		return "Rua "+this.rua+  ", "+this.numero+" - "+this.bairro+" - "+this.cidade;
	}
}
