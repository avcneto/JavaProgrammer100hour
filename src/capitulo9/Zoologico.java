package capitulo9;

public class Zoologico {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.comer();

		Zebra z = new Zebra();
		a = z;
		a.comer();

		Leao l = new Leao();
		l.comer();

		Passarinho p = new Passarinho();
		p.comer();
	}

}
