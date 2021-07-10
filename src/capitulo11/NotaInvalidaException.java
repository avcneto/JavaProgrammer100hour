package capitulo11;

public class NotaInvalidaException extends Exception {
	
	public NotaInvalidaException() {
		System.out.println("A nota deve estar entre 0 a 10");
	}

}
