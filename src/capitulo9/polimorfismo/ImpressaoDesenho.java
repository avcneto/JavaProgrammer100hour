package capitulo9.polimorfismo;

public class ImpressaoDesenho {
	public static void main(String[] args) {
		Desenho d = new Desenho();
		Desenho q = new Triangulo();
		Desenho t = new Quadrado();

		d.imprimir();
		q.imprimir();
		t.imprimir();
	}

}
