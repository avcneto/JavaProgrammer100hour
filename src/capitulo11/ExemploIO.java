package capitulo11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExemploIO {
	public static void main(String[] args) {
		try {
			FileReader doc;
			doc = new FileReader("e:\\carta.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Não foi possível localizar o arquivo!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Ocorrreu um erro ao tentar abrir o arquivo!");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Ocorrreu um erro desconhecido!");
			e.printStackTrace();
		}
	}

}
