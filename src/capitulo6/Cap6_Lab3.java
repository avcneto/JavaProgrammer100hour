package capitulo6;

public class Cap6_Lab3 {
	public static void main(String args[]) {

		Aluno joao = new Aluno();
		joao.setNome("João");
		Aluno.contadorDeAlunos++;
		System.out.println(joao.getNome() + " " + Aluno.contadorDeAlunos);
		Aluno maria = new Aluno();
		maria.setNome("Maria");
		Aluno.contadorDeAlunos++;
		System.out.println(maria.getNome() + " " + Aluno.contadorDeAlunos);
		Aluno marcos = new Aluno();
		marcos.setNome("Marcos");
		Aluno.contadorDeAlunos++;
		System.out.println(marcos.getNome() + " " + Aluno.contadorDeAlunos);

	}

}
