package pessoas;
import veiculos.Veiculo;

public class Motorista extends Pessoa{
	private String nCNH;
	private int situacao;
	private Veiculo veiculo;
		
	public Motorista(String nome, String cpf, String telefone) {
		super(nome,cpf,telefone);
	}
}
