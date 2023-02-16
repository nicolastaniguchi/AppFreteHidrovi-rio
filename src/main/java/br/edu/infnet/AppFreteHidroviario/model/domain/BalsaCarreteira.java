package br.edu.infnet.AppFreteHidroviario.model.domain;

public class BalsaCarreteira extends Embarcacoes {
	
	private int tamanho;
	private int qtdeFrotas;
	private boolean segurancas;
	
	public BalsaCarreteira(String frota, String nome, float valor) {
		super(frota, nome, valor);
	}

	@Override
	public float calcularValorFrete() {

		return 0;
	}	
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append(";");		
		sb.append(tamanho);
		sb.append(";");
		sb.append(qtdeFrotas);		
		sb.append(";");
		sb.append(segurancas ? "segurancas=S" : "segurancas=N");		
		
		return sb.toString();
	}
		
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public int getQtdeFrotas() {
		return qtdeFrotas;
	}
	public void setQtdeFrotas(int qtdeFrotas) {
		this.qtdeFrotas = qtdeFrotas;
	}
	public boolean isSegurancas() {
		return segurancas;
	}
	public void setSegurancas(boolean segurancas) {
		this.segurancas = segurancas;
	}
}
