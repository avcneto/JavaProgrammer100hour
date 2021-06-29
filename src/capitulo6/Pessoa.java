package capitulo6;

public class Pessoa {
	private String nome;
	private int idade;
	private char sexo;

	public void exibirDados() {
		System.out.println("Nome da pessoa " + getNome());
		System.out.println("Idade da pessoa " + getIdade());
		System.out.println("Sexo da pessoa " + getSexo());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}
