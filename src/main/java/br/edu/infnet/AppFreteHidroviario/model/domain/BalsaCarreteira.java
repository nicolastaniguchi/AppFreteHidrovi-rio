package br.edu.infnet.AppFreteHidroviario.model.domain;

public class BalsaCarreteira extends Embarcacoes {
	

	private int qtdeFrotas;
	private boolean segurancas;
	
	public BalsaCarreteira(Integer frota, String nome, float valor, float comprimento, float largura, float altura) {
		super(frota, nome, valor, comprimento, largura, altura);
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
		sb.append(qtdeFrotas);		
		sb.append(";");
		sb.append(segurancas ? "segurancas=S" : "segurancas=N");		
		
		return sb.toString();
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
