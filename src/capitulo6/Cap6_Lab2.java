package capitulo6;

public class Cap6_Lab2 {
	public static void main(String[] args) {
		Calculadora cal = new Calculadora();

		System.out.println("Sobrecarga " + cal.subtrair(10.5, 10.5));
		System.out.println("Sobrecarga " + cal.subtrair(1F, 3F));
		System.out.println("Sobrecarga " + cal.subtrair(10, 10.5));

	}

}
