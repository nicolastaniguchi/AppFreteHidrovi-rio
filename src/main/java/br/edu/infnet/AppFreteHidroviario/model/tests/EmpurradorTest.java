package br.edu.infnet.AppFreteHidroviario.model.tests;

import br.edu.infnet.AppFreteHidroviario.model.domain.Empurrador;

public class EmpurradorTest {
	public static void main(String[] args) {

		Empurrador e1 = new Empurrador("Yamato", 1000, 30, 10, 2, true, true, 1);
		e1.imprimir();


		Empurrador e2 = new Empurrador("Yamato02", 2000, 30, 10, 2, false, true, 2);
		e2.imprimir();

		Empurrador e3 = new Empurrador("Yamato03", 3000, 30, 10, 2, true, false, 4);
		e3.imprimir();
	}
}
