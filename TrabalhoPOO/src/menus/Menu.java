package menus;

import utilidades.*;
import cadastros.Cadastros;
import corrida.*;

public class Menu {

	Cadastros cadastros;

	public Menu(Cadastros cadastros) {
		this.cadastros = cadastros;
	}

	public void MenuPrincipal() {
		int opcao = 0;

		do {
			System.out.println("\n=========================================");
			System.out.println("POOBER - MENU PRINCIPAL");
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
			System.out.println("POOBER - MENU DE CADASTROS");
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
		int opcao = 0;

		do {
			System.out.println("=========================================");
			System.out.println("POOBER - MENU DE CORRIDAS");
			System.out.println("=========================================");
			System.out.println("1 - SOLICITAR CORRIDA");
			System.out.println("2 - ACEITAR CORRIDA");
			System.out.println("3 - INICIAR CORRIDA");
			System.out.println("4 - FINALIZAR CORRIDA");
			System.out.println("5 - CANCELAR CORRIDA");
			System.out.println("6 - AVALIAR CORRIDA");
			System.out.println("0 - VOLTAR");

			opcao = PegarResposta.RespostaInt();

			switch (opcao) {
			case 1:
					Corrida.SolicitarCorrida();
				break;
			case 2:
				Corrida.AceitaCorrida();
				break;
			case 3:
				Corrida.IniciaCorrida();
				break;
			case 4:
				Corrida.FinalizaCorrida();
				break;
			case 5:
				Corrida.CancelaCorrida();
				break;
			case 6:
				Corrida.AvaliarCorrida();
				break;

			}

		} while (opcao != 0);

		MenuPrincipal();

	}

	private void MenuConsultas() {
		int opcao = 0;

		do {
			System.out.println("\n=========================================");
			System.out.println("POOBER - MENU DE CONSULTAS");
			System.out.println("=========================================");
			System.out.println("1 - LISTAR CORRIDAS");
			System.out.println("2 - CONSULTAR PASSAGEIROS");
			System.out.println("3 - CONSULTAR MOTORISTAS");
			System.out.println("4 - CONSULTAR VEICULOS");
			System.out.println("0 - VOLTAR");

			opcao = PegarResposta.RespostaInt();

			switch (opcao) {
			case 1:
					
				break;
			case 2:
				cadastros.ListarPassageiros();
				break;
			case 3:
				cadastros.ListarMotoristas();
				break;
			case 4:
				cadastros.ListarVeiculos();
				break;
			}

		} while (opcao != 0);

		MenuPrincipal();
	}

}
