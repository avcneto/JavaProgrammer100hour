package capitulo9.laboratorio1;

public class RG {
	private int numero;
	private String dataNasc;

	public RG() {
	}

	public RG(int numero, String dataNasc) {
		this.numero = numero;
		this.dataNasc = dataNasc;
	}

	public int getNumero() {
		return numero;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "RG [numero=" + numero + ", dataNasc=" + dataNasc + "]";
	}

}
