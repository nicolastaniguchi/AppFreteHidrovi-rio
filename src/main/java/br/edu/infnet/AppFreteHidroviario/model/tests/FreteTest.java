package br.edu.infnet.AppFreteHidroviario.model.tests;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.AppFreteHidroviario.model.domain.BalsaCarreteira;
import br.edu.infnet.AppFreteHidroviario.model.domain.Cliente;
import br.edu.infnet.AppFreteHidroviario.model.domain.Embarcacoes;
import br.edu.infnet.AppFreteHidroviario.model.domain.Frete;

public class FreteTest {
	public static void main(String[] args) {

		BalsaCarreteira bc1 = new BalsaCarreteira("001","Yamato01", 1000, 80, 20, 2, 20, true);

		BalsaCarreteira bc2 = new BalsaCarreteira("002","Yamato02", 2000, 60, 10, 1, 30, false);

		BalsaCarreteira bc3 = new BalsaCarreteira("003","Yamato03", 3000, 20, 5, 1, 40, true);

		Cliente c1 = new Cliente("Empresa01", "123123123", "empresa01@email.com");
		Cliente c2 = new Cliente("Empresa02", "456456456", "empresa02@email.com");
		Cliente c3 = new Cliente("Empresa03", "890890890", "empresa03@email.com");

		List<Embarcacoes> embarcacoesE1 = new ArrayList<>();
		embarcacoesE1.add(bc1);
		List<Embarcacoes> embarcacoesE2 = new ArrayList<>();
		embarcacoesE2.add(bc2);
		embarcacoesE2.add(bc3);
		List<Embarcacoes> embarcacoesE3 = new ArrayList<>();
		embarcacoesE3.add(bc1);
		embarcacoesE3.add(bc2);
		embarcacoesE3.add(bc3);

		Frete f1 = new Frete();
		f1.setDescricao("Primeiro frete");
		f1.setCliente(c1);
		f1.setEmbarcacoes(embarcacoesE1);
		f1.imprimir();

		Frete f2 = new Frete();
		f2.setDescricao("Segundo frete");
		f2.setCliente(c2);
		f2.setEmbarcacoes(embarcacoesE2);
		f2.imprimir();

		Frete f3 = new Frete();
		f3.setDescricao("Terceiro frete");
		f3.setCliente(c3);
		f3.setEmbarcacoes(embarcacoesE3);
		f3.imprimir();
	}
}