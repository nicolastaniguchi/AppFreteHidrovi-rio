package br.edu.infnet.AppFreteHidroviario.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TEmbarcacoes")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Embarcacoes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String frota;
	private String nome;
	private float valor;
	private float comprimento;
	private float largura;
	private float altura;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	@ManyToMany(mappedBy = "embarcacoes")
	private List<Frete> frete;

	public Embarcacoes() {

	}

	public Embarcacoes(String frota, String nome, float valor, float comprimento, float largura, float altura) {
		this.frota = frota;
		this.nome = nome;
		this.valor = valor;
		this.comprimento = comprimento;
		this.largura = largura;
		this.altura = altura;
	}

	public Embarcacoes(String nome, float valor, float comprimento, float largura, float altura) {
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

	public String getFrota() {
		return frota;
	}

	public void setFrota(String frota) {
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Frete> getFrete() {
		return frete;
	}

	public void setFrete(List<Frete> frete) {
		this.frete = frete;
	}




}
