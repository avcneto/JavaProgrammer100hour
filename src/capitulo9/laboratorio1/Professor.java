package capitulo9.laboratorio1;

public class Professor extends Pessoa {
	private float salario;
	private String diciplina;

	public Professor() {
		super();
	}

	public Professor(String nome, int idade, char sexo, RG rg, float salario, String diciplina) {
		super(nome, idade, sexo, rg);
		this.salario = salario;
		this.diciplina = diciplina;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getDiciplina() {
		return diciplina;
	}

	public void setDiciplina(String diciplina) {
		this.diciplina = diciplina;
	}

	@Override
	public void falar(String fala) {
		System.out.println(getNome() + " Falando....");

	}

	@Override
	public void mostrarDados() {
		toString();

	}

	@Override
	public String toString() {
		return "Professor [salario=" + salario + ", diciplina=" + diciplina + super.toString() + "]";
	}

}
