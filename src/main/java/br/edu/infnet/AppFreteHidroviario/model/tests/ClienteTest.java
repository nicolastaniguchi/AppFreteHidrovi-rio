package br.edu.infnet.AppFreteHidroviario.model.tests;

import br.edu.infnet.AppFreteHidroviario.model.domain.Cliente;

public class ClienteTest {
	public static void main(String[] args) {

		Cliente c1 = new Cliente("Empresa01", "123123123", "empresa01@email.com");
		System.out.println(c1);

		Cliente c2 = new Cliente("Empresa02", "456456456", "empresa02@email.com");
		System.out.println(c2);

		Cliente c3 = new Cliente("Empresa03", "789789789", "empresa03@email.com");
		System.out.println(c3);

	}

}
