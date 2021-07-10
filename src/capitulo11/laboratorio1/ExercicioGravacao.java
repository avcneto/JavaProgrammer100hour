package capitulo11.laboratorio1;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Minha ducumentação
 * 
 * @author Neto
 *
 */
public class ExercicioGravacao {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a mensagem para gravar no arquivo");
		String mensagem = leitor.next();
		leitor.close();
		try {
			PrintWriter writer = new PrintWriter("C:\\Users\\decon\\Desktop\\texto.txt");
			writer.println(mensagem);
			writer.close();
			System.out.println("Frase gravada com sucesso!!!");
		} catch (Exception e) {
			System.out.println("Não foi possivel escrever no arquivo");
			e.printStackTrace();
		}

	}

}
