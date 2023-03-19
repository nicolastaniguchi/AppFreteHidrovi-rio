package br.edu.infnet.AppFreteHidroviario.model.domain;

public class BalsaCarreteira extends Embarcacoes {

	private Integer qtdeFrotas;
	private boolean segurancas;

	public BalsaCarreteira(String nome, float valor, float comprimento, float largura, float altura, Integer qtdeFrotas,
			boolean segurancas) {
		super(nome, valor, comprimento, largura, altura);
		this.qtdeFrotas = qtdeFrotas;
		this.segurancas = segurancas;
	}

	@Override
	public float calcularValorFrete() {

		return 0;
	}

	@Override
	public String toString() {
		return String.format("nome=%s, valor=%f, comprimento=%f, largura=%f, altura=%f,qtde frotas=%d, segurancas=%b",
				super.getNome(), super.getValor(), super.getComprimento(), super.getLargura(), super.getAltura(),
				qtdeFrotas, segurancas);
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
