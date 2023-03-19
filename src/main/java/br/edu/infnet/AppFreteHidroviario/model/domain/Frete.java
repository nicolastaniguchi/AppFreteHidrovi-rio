package br.edu.infnet.AppFreteHidroviario.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Frete {

	private String nomeDaEmbarcacao;
	private String descricao;
	private LocalDateTime data;
	private Cliente cliente;
	private List<Embarcacoes> embarcacoes;

	public Frete() {
		data = LocalDateTime.now();
	}
	
	public void imprimir() {
		System.out.println("Frete: " + this);
		System.out.println("Qtde de Embarcações: " + embarcacoes.size());
		System.out.println("Solicitante: " + cliente);

		
	}

	@Override
	public String toString() {

	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

	return String.format("Está retornando o %s, pedido em %s",
				descricao,
				data.format(formato)
			);
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Embarcacoes> getEmbarcacoes() {
		return embarcacoes;
	}
	public void setEmbarcacoes(List<Embarcacoes> embarcacoes) {
		this.embarcacoes = embarcacoes;
	}
	public LocalDateTime getData() {
		return data;
	}

	public String getNomeDaEmbarcacao() {
		return nomeDaEmbarcacao;
	}

	public void setNomeDaEmbarcacao(String nomeDaEmbarcacao) {
		this.nomeDaEmbarcacao = nomeDaEmbarcacao;
	}

}
