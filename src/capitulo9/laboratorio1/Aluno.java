package capitulo9.laboratorio1;

public class Aluno extends Pessoa {
	private float mensalidade;
	private String curso;

	@Override
	public String toString() {
		return "Aluno [mensalidade=" + mensalidade + ", curso=" + curso + super.toString() + "]";
	}

	public Aluno() {
		super();
	}

	public Aluno(String nome, int idade, char sexo, RG rg, float mensalidade, String curso) {
		super(nome, idade, sexo, rg);
		this.mensalidade = mensalidade;
		this.curso = curso;
	}

	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public void falar(String fala) {
		System.out.println(getNome() + " Falando....");

	}

	@Override
	public void mostrarDados() {
		toString();

	}

}
