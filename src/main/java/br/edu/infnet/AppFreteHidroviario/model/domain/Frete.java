package br.edu.infnet.AppFreteHidroviario.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TFrete")
public class Frete {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private LocalDateTime data;
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idSolicitante")
	private Cliente cliente;
	@ManyToMany(cascade = CascadeType.DETACH)
	private List<Embarcacoes> embarcacoes;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;

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

		return String.format("Está retornando o %s, pedido em %s", descricao, data.format(formato));
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
