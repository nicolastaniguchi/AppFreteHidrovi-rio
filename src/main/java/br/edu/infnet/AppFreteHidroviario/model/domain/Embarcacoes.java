package br.edu.infnet.AppFreteHidroviario.model.domain;

public abstract class Embarcacoes {
	
	private String frota;
	private String nome;
	private float valor;
	
	public Embarcacoes(String frota, String nome, float valor) {
		this.frota = frota;
		this.nome = nome;
		this.valor = valor;
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
		
		return sb.toString();
	}
	
	

	public String getFrota() {
		return frota;
	}

	public String getNome() {
		return nome;
	}

	public float getValor() {
		return valor;
	}
	
}
