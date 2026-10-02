package menus;

import utilidades.PegarResposta;
import cadastros.Cadastros;

public class Menu {

	Cadastros cadastros;

	public Menu(Cadastros cadastros) {
		this.cadastros = cadastros;
	}

	public void MenuPrincipal() {
		int opcao = 0;

		do {
			System.out.println("\n=========================================");
			System.out.println("SISTEMA DE TRANSPORTE");
			System.out.println("=========================================");
			System.out.println("1 - CADASTROS");
			System.out.println("2 - CORRIDAS");
			System.out.println("3 - CONSULTAS");
			System.out.println("0 - SAIR");
			
			opcao = PegarResposta.RespostaInt();

			switch (opcao) {
			case 1:
				MenuCadastros();
				break;
			case 2:
				MenuCorridas();
				break;
			case 3:
				MenuConsultas();
				break;
			case 0:
				System.exit(0);
				break;
			}

		} while (opcao != 0);
	}

	private void MenuCadastros() {
		int opcao = 0;

		do {
			System.out.println("\n=========================================");
			System.out.println("MENU DE CADASTROS");
			System.out.println("=========================================");
			System.out.println("1 - CADASTRAR PASSAGEIRO");
			System.out.println("2 - CADASTRAR MOTORISTA");
			System.out.println("3 - CADASTRAR VEICULO");
			System.out.println("0 - VOLTAR");

			opcao = PegarResposta.RespostaInt();

			switch (opcao) {
			case 1:
				cadastros.CadastrarPassageiro();
				break;
			case 2:
				cadastros.CadastrarMotorista();
				break;
			case 3:
				cadastros.CadastrarVeiculo();
				break;
			}

		} while (opcao != 0);

		MenuPrincipal();
	}

	private void MenuCorridas() {

	}

	private void MenuConsultas() {
		int opcao = 0;

		do {
			System.out.println("\n=========================================");
			System.out.println("MENU DE CONSULTAS");
			System.out.println("=========================================");
			System.out.println("1 - LISTAR CORRIDAS");
			System.out.println("2 - CONSULTAR PASSAGEIROS");
			System.out.println("3 - CONSULTAR MOTORISTA");
			System.out.println("0 - VOLTAR");

			opcao = PegarResposta.RespostaInt();

			switch (opcao) {
			case 1:
					opcao=0; //MUDAR PARA LISTAR CORRIDAS
				break;
			case 2:
				cadastros.ListarPassageiros();
				break;
			case 3:
				cadastros.ListarMotoristas();
				break;
			}

		} while (opcao != 0);

		MenuPrincipal();
	}

}
