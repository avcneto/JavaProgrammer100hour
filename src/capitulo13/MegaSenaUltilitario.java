package capitulo13;

import java.util.Random;

public class MegaSenaUltilitario {
	public static int sortearNumero() {
		Random sorteador = new Random();
		int numero = sorteador.nextInt();

		while (numero < 0 || numero > 60) {
			numero = sorteador.nextInt();
		}
		return numero;
	}

}
