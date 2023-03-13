package br.edu.infnet.AppFreteHidroviario.model.domain;

public class Cliente {
	
	private Integer id;																								
	private String nome;
	private String cpf;
	private String email;
	
	public Cliente(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return String.format("nome=%s, cpf= %s, email= %s", nome, cpf, email);
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email; 
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	 
}
