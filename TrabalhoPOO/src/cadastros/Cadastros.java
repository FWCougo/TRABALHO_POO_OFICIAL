package cadastros;

import java.util.ArrayList;
import java.util.List;

import pessoas.*;
import utilidades.PegarResposta;
import veiculos.Veiculo;

public class Cadastros {

	private List<Passageiro> passageiros = new ArrayList<Passageiro>();
	private List<Motorista> motoristas = new ArrayList<Motorista>();

	public void CadastrarPassageiro() {

		String nome;
		String cpf;
		String telefone;

		System.out.println("=========================================");
		System.out.println("CADASTRAR PASSAGEIRO");
		System.out.println("=========================================");

		System.out.print("DIGITE O NOME DO PASSAGEIRO: ");
		nome = PegarResposta.RespostaString();

		System.out.print("DIGITE O CPF DO PASSAGEIRO: ");
		cpf = PegarResposta.RespostaString();

		System.out.print("DIGITE O TELEFONE DO PASSAGEIRO: ");
		telefone = PegarResposta.RespostaString();

		Passageiro p = new Passageiro(nome, cpf, telefone);

		passageiros.add(p);

	}

	public void ListarPassageiros() {
		for (int i = 0; i < passageiros.size(); i++) {
			Passageiro p = passageiros.get(i);
			System.out.println(i + "-" + p.getNome());
		}
	}

//----------------------------------------------------------------------------------
	public void CadastrarMotorista() {

		String nome;
		String cpf;
		String telefone;
		String nCNH;
		Veiculo veiculo;

		System.out.println("=========================================");
		System.out.println("CADASTRAR MOTORISTA");
		System.out.println("=========================================");

		System.out.print("DIGITE O NOME DO MOTORISTA: ");
		nome = PegarResposta.RespostaString();

		System.out.print("DIGITE O CPF DO MOTORISTA: ");
		cpf = PegarResposta.RespostaString();

		System.out.print("DIGITE O TELEFONE DO MOTORISTA: ");
		telefone = PegarResposta.RespostaString();

		System.out.print("DIGITE O N° DA CNH DO MOTORISTA: ");
		nCNH = PegarResposta.RespostaString();

		Motorista m = new Motorista(nome, cpf, telefone, nCNH);

		motoristas.add(m);
	}

	public void ListarMotoristas() {
		for (int i = 0; i < motoristas.size(); i++) {
			Motorista m = motoristas.get(i);
			System.out.println(i + "-" + m.getNome() + " | " + m.MostrarSituacao());
		}
	}

//----------------------------------------------------------------------------------

	public void CadastrarVeiculo() {

		String nome;

		System.out.println("=========================================");
		System.out.println("CADASTRAR VEICULO");
		System.out.println("=========================================");

		System.out.print("DIGITE O NOME DO VEICULO: ");
		nome = PegarResposta.RespostaString();

		// Motorista m = new Motorista(nome,cpf,telefone,nCNH);

		// motoristas.add(m);
	}

	public void ListarVeiculos() {
		for (int i = 0; i < motoristas.size(); i++) {
			Motorista m = motoristas.get(i);
			System.out.println(i + "-" + m.getNome());
		}
	}

}
