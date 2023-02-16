package br.edu.infnet.AppFreteHidroviario.model.tests;

import br.edu.infnet.AppFreteHidroviario.model.domain.Cliente;
import br.edu.infnet.AppFreteHidroviario.model.domain.Frete;

public class FreteTest {
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Empresa01", "123123123", "empresa01@email.com");	
		Cliente c2 = new Cliente("Empresa02", "456456456", "empresa02@email.com");
		
		Frete f1 = new Frete();
		f1.setDescricao("Primeiro pedido");
		f1.setCliente(c1);
		System.out.println(f1);
		
		Frete f2 = new Frete();
		f2.setDescricao("Segundo pedido");
		f2.setCliente(c2);
		System.out.println(f2);
		
	}
}
