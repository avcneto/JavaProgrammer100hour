package br.com.impacta.prateleiradigital.negocio;

public class FiltroFilme {
	private String tituloParcial, genero;
	private int anoInicial, anoFinal;

	public void setAll(String tituloParcial, String genero, int anoInicial, int anoFinal) {
		this.tituloParcial = tituloParcial;
		this.genero = genero;
		this.anoInicial = anoInicial;
		this.anoFinal = anoFinal;
	}

	@Override
	public String toString() {
		return "FiltroFilme [tituloParcial=" + tituloParcial + ", genero=" + genero + ", anoInicial=" + anoInicial
				+ ", anoFinal=" + anoFinal + "]";
	}

	public FiltroFilme(String tituloParcial, String genero, int anoInicial, int anoFinal) {
		this.tituloParcial = tituloParcial;
		this.genero = genero;
		this.anoInicial = anoInicial;
		this.anoFinal = anoFinal;
	}

	public FiltroFilme() {
	}

	public String getTituloParcial() {
		return tituloParcial;
	}

	public void setTituloParcial(String tituloParcial) {
		this.tituloParcial = tituloParcial;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnoInicial() {
		return anoInicial;
	}

	public void setAnoInicial(int anoInicial) {
		if (anoInicial > 0) {
			this.anoInicial = anoInicial;
		}

	}

	public int getAnoFinal() {
		return anoFinal;
	}

	public void setAnoFinal(int anoFinal) {
		if (anoFinal > getAnoInicial()) {
			this.anoFinal = anoFinal;

		}

	}

}
