package capitulo12;

import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 * 
 * @author Neto
 *
 *         Classe para testar a gravacao de arquivos.
 */
public class Javadoc {
	int versao = 1;

	/**
	 * 
	 * @return Este metodo retornara um inteiro correspondente a versao do programa.
	 */
	public int getVersao() {
		return versao;
	}

	/**
	 * neste metodo serao monitoradas possiveis excecoes com base na classe
	 * <strong>Exception </strong>.
	 * 
	 * @param versao <strong>Versao</strong>valor a ser passado para a variavel
	 *               versao do programa
	 * @throws Exception podera gerar qualquer excecao.
	 */
	public void setVersao(int versao) throws Exception {
		this.versao = versao;
	}

	/**
	 * metodo main onde ira inicializar a execucao do programa.
	 * 
	 * @param args O metodo main podera, de acordo com a logica de desenvolvimento
	 *             receber parametros em tempo de execucao.
	 * 
	 */
	public static void main(String[] args) {
		try {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Digite uma frase:");
//            String texto = scanner.nextLine();
			/**
			 * 
			 * O atributo texto <strong>Texto</strong> ira receber um bloco de informacoes a
			 * ser gravado em um arquivo doc1.txt no diretorio definido.
			 */
			String texto = JOptionPane.showInputDialog("Digite o texto: ");
			PrintWriter writer = new PrintWriter("F:\\doc1.txt");
			writer.println(texto);
			writer.close();
			System.out.println("Frase gravada com sucesso.");
		} catch (IOException ioe) {
			System.out.println("Falha ao gravar as informações digitadas.");
		}
	}
}