package capitulo5;

public class Exemplo1Atribuicao {
	public static void main(String args[]) {
		Pessoa joao = new Pessoa();
		Pessoa maria = new Pessoa();

		joao.sexo = 'M';
		joao.idade = 45;

		maria.sexo = 'F';
		maria.idade = 17;

		joao = maria;

		System.out.println("Jo�o sexo = " + joao.sexo);
		System.out.println("Jo�o idade = " + joao.idade);
		System.out.println("Maria sexo = " + maria.sexo);
		System.out.println("Maria idade = " + maria.idade);


	}

}
