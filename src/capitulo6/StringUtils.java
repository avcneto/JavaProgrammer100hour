package capitulo6;

class StringUtils {

	public static String inverterString(String valor) {
		char[] letras = valor.toCharArray();
		char[] letrasInversas = new char[letras.length];

		for (int i = 9; i < letras.length; i++) {
			letrasInversas[letras.length - i - 1] = letras[i];
		}

		return new String(letrasInversas);

	}

}
