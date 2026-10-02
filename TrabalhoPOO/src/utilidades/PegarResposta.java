package utilidades;

import java.util.Scanner;

public class PegarResposta {

	private static Scanner sc = new Scanner(System.in);

	public static int RespostaInt() {

		int r = -1;

		System.out.print("\nResposta: ");

		String rString = sc.nextLine();

		if (rString.matches("[0-9]+")) {
			r = Integer.parseInt(rString);
			return r;
		} else {
			System.out.println("********** RESPOSTA INVÁLIDA **********");
			return r;
		}

	}

	public static String RespostaString() {
		String s = sc.nextLine();
		return s;
	}

}
