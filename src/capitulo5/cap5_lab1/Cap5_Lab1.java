package capitulo5.cap5_lab1;

public class Cap5_Lab1 {
	public static void main(String[] args) {
		Funcionario fun = new Funcionario();

		fun.setNome("Pedro");
		fun.setSobrenome("vieira");
		fun.setCargo("Engenheiro");
		fun.setSalario(1000.00);

		System.out.println("Nome: " + fun.getNome());
		System.out.println("Sobrenome: " + fun.getSobrenome());
		System.out.println("Cargo: " + fun.getCargo());
		System.out.println("Salario: " + fun.getSalario());

	}

}
