package capitulo5;

public class TesteEmpregado {
	public static void main(String[] args) {

		Empregado emp = new Empregado();
		emp.setEndereco("Avenida paulista");
		emp.setIdade(30);

		System.out.println(emp.mostrar());
	}

}
