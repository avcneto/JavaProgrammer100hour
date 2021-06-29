package capitulo6;

public class ExemploFluxoExecucaoComandos {
	static void executarTarefa() {
		System.out.println("Executando uma tarefa");
	}

	public static void main(String args[]) {
		System.out.println("Executando o primeiro comando");
		System.out.println("Executando o segundo comando");
		System.out.println(" . ");
		System.out.println(" . ");
		System.out.println(" . ");
		System.out.println(" . ");

		executarTarefa();

		System.out.println("Sou o proximo comando que segue a chamada do metodo");
		System.out.println(" . ");
		System.out.println(" . ");
		System.out.println(" . ");
		System.out.println("Executar o ultimo comando");

	}

}
