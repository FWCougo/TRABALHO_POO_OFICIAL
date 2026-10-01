package utilidades;
import java.util.Scanner;

public class PegarResposta {

	private static Scanner sc = new Scanner(System.in);
	
	public static int RespostaInt() {
		
		System.out.print("\nResposta: ");
		
		String resposta =  sc.nextLine();		
		
		System.out.print("\n");	
		
		if(resposta.matches("[0-9]+")) {
			return Integer.parseInt(resposta);
		}
		else {
			return -1;
		}			
	}
	
	public static String RespostaString() {
		
		System.out.print("\nResposta: ");
		
		String s = sc.nextLine();	
		
		System.out.print("\n");	
		
		return s;
	}
	
}
