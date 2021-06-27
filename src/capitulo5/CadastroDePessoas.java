package capitulo5;

public class CadastroDePessoas {
	public static void main(String [] args) {
		Pessoa pes = new Pessoa();
		
		
		pes.nome = "Manuel";
		pes.idade = 25;
		
		
		System.out.println("Nome: " + pes.nome);
		System.out.println("Idade: " + pes.idade);
	}

}
