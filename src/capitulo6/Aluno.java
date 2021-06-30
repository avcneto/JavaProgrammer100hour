package capitulo6;

public class Aluno {
	private String nome;
	public static int contadorDeAlunos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void imprimirAluno() {
		System.out.println(getNome());
	}

}
