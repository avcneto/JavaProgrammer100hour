package capitulo6;

public class AtributoEstatico {
	@SuppressWarnings("static-access")
	public static void main(String args[]) {
		Classe a = new Classe();
		Classe b = new Classe();
		Classe c = new Classe();

		a.ano = 2012;
		System.out.println(c.ano);
		b.ano = 2013;
		System.out.println(c.ano);
	}

}
