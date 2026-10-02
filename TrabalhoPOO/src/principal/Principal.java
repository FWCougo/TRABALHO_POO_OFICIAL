package principal;

import cadastros.*;
import menus.*;

public class Principal {

	public static void main(String[] args) {		
		
		Cadastros cadastros = new Cadastros();
		Menu menu = new Menu(cadastros);
		
		menu.MenuPrincipal();
		
	}
	
	

}
