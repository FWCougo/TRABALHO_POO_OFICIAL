package pessoas;
import veiculos.*;

public class Motorista extends Pessoa{
	private String nCNH;
	private int situacao;
	private Moto moto;
	private Van van;
	private Carro carro;
		
	public Motorista(String nome, String cpf, String telefone, String nCNH) {
		super(nome,cpf,telefone);
		this.nCNH = nCNH;
	}
	
	public Motorista(String nome, String cpf, String telefone, String nCNH, Carro carro) {
		super(nome,cpf,telefone);
		this.nCNH = nCNH;
		this.carro = carro;
	}
	public Motorista(String nome, String cpf, String telefone, String nCNH, Moto moto) {
		super(nome,cpf,telefone);
		this.nCNH = nCNH;
		this.moto = moto;
	}
	public Motorista(String nome, String cpf, String telefone, String nCNH, Van van) {
		super(nome,cpf,telefone);
		this.nCNH = nCNH;
		this.van = van;
	}
}
