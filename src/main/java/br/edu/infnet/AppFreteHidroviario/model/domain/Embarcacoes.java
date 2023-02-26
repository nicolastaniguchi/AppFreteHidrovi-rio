package br.edu.infnet.AppFreteHidroviario.model.domain;

public abstract class Embarcacoes {
	
	private Integer frota;
	private String nome;
	private float valor;
	private float comprimento;
	private float largura;
	private float altura;
	
	public Embarcacoes(Integer frota, String nome, float valor, float comprimento, float largura, float altura) {
		this.frota = frota;
		this.nome = nome;
		this.valor = valor;
		this.comprimento = comprimento;
		this.largura = largura;
		this.altura = altura;
	}
	
	public abstract float calcularValorFrete();
	
	@Override
	public String toString() {


		StringBuilder sb = new StringBuilder();
		sb.append(frota);
		sb.append(";");
		sb.append(nome);
		sb.append(";");
		sb.append(valor);
		sb.append(";");
		sb.append(comprimento);
		sb.append(";");
		sb.append(largura);	
		sb.append(";");
		sb.append(altura);
		
		return sb.toString();
	}

	public Integer getFrota() {
		return frota;
	}

	public void setFrota(Integer frota) {
		this.frota = frota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
}
