package br.edu.infnet.AppFreteHidroviario.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TUsuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String senha;
	private String email;
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Cliente> cliente;
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Embarcacoes> embarcacoes;
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Frete> frete;

	public Usuario() {
	}

	public Usuario(String email, String senha) {
		this();
		this.setEmail(email);
		this.setSenha(senha);
	}

	public Usuario(String nome, String email, String senha) {
		this(email, senha);
		this.setNome(nome);
	}

	@Override
	public String toString() {
		return String.format("nome=%s, email= %s, senha= %s", nome, email, senha);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public List<Cliente> getClientes() {
		return cliente;
	}

	public void setClientes(List<Cliente> cliente) {
		this.cliente = cliente;
	}

	public List<Embarcacoes> getEmbarcacoes() {
		return embarcacoes;
	}

	public void setEmbarcacoes(List<Embarcacoes> embarcacoes) {
		this.embarcacoes = embarcacoes;
	}

	public List<Frete> getFrete() {
		return frete;
	}

	public void setFrete(List<Frete> frete) {
		this.frete = frete;
	}
	
}
