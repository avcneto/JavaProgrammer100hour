package capitulo9.laboratorio1;

public class Cap9_Lab1 {
	public static void main(String[] args) {
		Pessoa Sabrina = new Aluno("Sabrina", 18, 'F', new RG(123456, "2021-01-01"), 500, "Java");
		Pessoa Joao = new Aluno("João", 29, 'M', null, 600, "Python");
		Pessoa Mario = new Professor("Mario", 36, 'M', null, 10000, "Java e Python");

		System.out.println(Sabrina.toString());
		System.out.println(Joao.toString());
		System.out.println(Mario.toString());

	}

}
