package capitulo6;

public class MetodoEstatico {
	@SuppressWarnings("static-access")
	public static void main(String args[]) {
		Classe2.metodoEstatico(); // n�o precisa ser instanciada
		new Classe2().metodoNaoEstatico(); //esta sendo instanciada
	}

}
