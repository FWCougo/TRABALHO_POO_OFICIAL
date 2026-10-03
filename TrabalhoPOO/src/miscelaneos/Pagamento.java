package miscelaneos;

import veiculos.*;
import corridas.*;

//SOMENTE COM STATUS DE CORRIDA FINALIZADA!!

//taxabase + dinheiro(ex 1,50) por km.

//acrescimo conforme categoria de corrida:
//ECONOMICA: + 0%      CONFORTO: + 20%    PREMIUM: + 50%

//POR FORMA DE PAGAMENTO:
//DINEHIRO: 0%    PIX: - 5%  CARTÃO: + 3%

public class Pagamento {
	
	private float tarifaDistancia = calcularTarifaDistancia();

	public Pagamento() {}
	

	//opcao ultima:
	public float calcularTarifaDistancia(Veiculo veiculo, Corrida corrida) {
        return ((veiculo.getSegundaTarifa() * corrida.getDistancia()) + veiculo.getTarifaBase());
    }
	
	//OBS: preciso conseguir pegar o valor da distancia ainda...
}

