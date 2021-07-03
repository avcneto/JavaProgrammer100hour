package capitulo8;

public class ArrayBidimensional {
	public static void main(String args []) {
		double notas[][] = new double[100][3];
		//100 quantidade de alunos
		//3 quantidade de notas
		
		notas[0][0] = 6.5;
		notas[0][1] = 7.5;
		notas[0][2] = 7.0;
		
		notas[1][0] = 5.4;
		notas[2][1] = 9.0;
		notas[3][2] = 4.1;
		
		notas[99][0] = 7.2;
		notas[99][1] = 8.6;
		notas[99][2] = 6.5;
		
		
		System.out.println(notas[99][0]);
	}

}
