package br.edu.infnet.AppFreteHidroviario.model.tests;

import br.edu.infnet.AppFreteHidroviario.model.domain.Empurrador;

public class EmpurradorTest {
	public static void main(String[] args) {
		
		Empurrador e1 = new Empurrador(1, "Yamato", 1000, 30, 10, 2, true, true, 1);
		e1.setMotor(1);
		e1.setRancho(false);
		e1.setTripulacao(false);
		System.out.println(e1);
		e1.imprimir();
		
		
		Empurrador e2 = new Empurrador(2, "Yamato02", 2000, 30, 10, 2, false, true, 2);
		e2.setMotor(2);
		e2.setRancho(true);
		e2.setTripulacao(true);
		System.out.println(e2);
		e2.imprimir();
		
		Empurrador e3 = new Empurrador(3, "Yamato03", 3000, 30, 10, 2, true, false, 4);
		e3.setMotor(4);
		e3.setRancho(true);
		e3.setTripulacao(false);
		System.out.println(e3);
		e3.imprimir();
	}
}
