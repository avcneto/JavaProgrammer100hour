package capitulo7;

public class Cadastro {
	private String nome;
	private String sobrenome;
	private int idade;

	public void mostrar() {
		if (nome == null)
			nome = "Nome: N�o cadastrado";
		if (sobrenome == null)
			sobrenome = "Sobrenome: N�o cadastrado!";

		System.out.println("Nome: " + nome);
		System.out.println("Sobrenome: " + sobrenome);

		if (idade == 0)
			System.out.println("Idade: N�o cadastrada ");
		else
			System.out.println("Idade: " + idade);
		System.out.println();
	}

	public Cadastro() {

	}

	public Cadastro(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public Cadastro(String nome, String sobrenome, int idade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
