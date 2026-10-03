package principal;

import cadastros.*;
import menus.*;

public class Principal {

	public static void main(String[] args) {		
		
		Cadastros cadastros = new Cadastros();
		GerenciarCorridas gerenciadorCorrida = new GerenciarCorridas();
		Menu menu = new Menu(cadastros, gerenciadorCorrida);
		
		menu.MenuPrincipal();
		
	}
	
	

}
