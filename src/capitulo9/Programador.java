package capitulo9;

public class Programador extends Funcionario {
	String linguagem;
	String sistemaOperacional;

	public Programador() {
	}

	public Programador(String nome, String email, int idade, char sexo, String linguagem, String sistemaOperacional) {
		super(nome, email, idade, sexo);
		this.linguagem = linguagem;
		this.sistemaOperacional = sistemaOperacional;
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

	public String getSistemaOperacional() {
		return sistemaOperacional;
	}

	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}

	@Override
	public String toString() {
		return "Programador [linguagem=" + linguagem + ", sistemaOperacional=" + sistemaOperacional + " "
				+ super.toString() + "]";
	}

}
