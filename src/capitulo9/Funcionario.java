package capitulo9;

public class Funcionario {
	protected String nome;
	protected String email;
	protected int idade;
	protected char sexo;

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", email=" + email + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

	public void setAll(String nome, String email, int idade, char sexo) {

		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.sexo = sexo;
	}

	public Funcionario() {
	}

	public Funcionario(String nome, String email, int idade, char sexo) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
