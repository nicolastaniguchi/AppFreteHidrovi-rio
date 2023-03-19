package br.edu.infnet.AppFreteHidroviario.model.domain;

public class Empurrador extends Embarcacoes {

	private boolean tripulacao;
	private boolean rancho;
	private Integer motor;

	public Empurrador(String nome, float valor, float comprimento, float largura, float altura, boolean rancho, boolean tripulacao, Integer motor) {
		super(nome, valor, comprimento, largura, altura);
		this.rancho = rancho;
		this.tripulacao = tripulacao;
		this.motor = motor;
	}
	
	private float valorTripulacao() {
		return tripulacao ? 30000 : 0;
	}

	private float valorRancho() {
		return rancho ? 5000 : 0;
	}

	private Integer qtdeMotor() {

		switch (motor) {
		case 1:
			return 40000;
		case 2:
			return 70000;
		case 3:
			return 100000;
		default:
			System.out.println("O número escolhido é inválido, escolha uma quantidade entre 1 a 3.");
		}

		return motor;
	}

	@Override
	public float calcularValorFrete() {
		return getValor() + valorRancho() + valorTripulacao() + qtdeMotor();
	}

	public void imprimir() {
		float totalValorEmpurrador = calcularValorFrete();
		System.out.println("Empurrador = " + this);
		System.out.println("O valor do frete do empurrador é: " + totalValorEmpurrador);
	}

	@Override
	public String toString() {


		StringBuilder sb = new StringBuilder();

		sb.append(super.toString());
		sb.append(";");
		sb.append(tripulacao ? "Sim" : "Não");
		sb.append(";");
		sb.append(rancho ? "Sim" : "Não");
		sb.append(";");
		sb.append(motor);

		return sb.toString();
	}

	public boolean isTripulacao() {
		return tripulacao;
	}
	public void setTripulacao(boolean tripulacao) {
		this.tripulacao = tripulacao;
	}
	public boolean isRancho() {
		return rancho;
	}
	public void setRancho(boolean rancho) {
		this.rancho = rancho;
	}
	public int getMotor() {
		return motor;
	}
	public void setMotor(Integer motor) {
		this.motor = motor;
	}

}
