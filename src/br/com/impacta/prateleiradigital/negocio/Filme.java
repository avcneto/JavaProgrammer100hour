package br.com.impacta.prateleiradigital.negocio;

public class Filme {
	private static final double NOTA_MAXIMA = 10;
	private static final double NOTA_MINIMA = 0;

	private String titulo;
	private String diretore;
	private double nota;
	private int duracao;
	private int ano;
	private String genero;
	private int numDeVotos;
	private String url;

	public Filme() {

	}

	public Filme(String titulo, String diretore, double nota, int duracao, int ano, String genero, int numDeVotos,
			String url) {

		this.titulo = titulo;
		this.diretore = diretore;
		this.nota = nota;
		this.duracao = duracao;
		this.ano = ano;
		this.genero = genero;
		this.numDeVotos = numDeVotos;
		this.url = url;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDiretore() {
		return diretore;
	}

	public void setDiretore(String diretore) {
		this.diretore = diretore;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		if (nota >= NOTA_MINIMA && nota <= NOTA_MAXIMA)
			this.nota = nota;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		if (duracao > 0) {
			this.duracao = duracao;
		}

	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano > 0) {
			this.ano = ano;
		}

	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumDeVotos() {
		return numDeVotos;
	}

	public void setNumDeVotos(int numDeVotos) {
		if (numDeVotos > 0) {
			this.numDeVotos = numDeVotos;
		}

	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
