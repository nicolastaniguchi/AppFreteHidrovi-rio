package br.edu.infnet.AppFreteHidroviario.model.tests;

import br.edu.infnet.AppFreteHidroviario.model.domain.BalsaCarreteira;

public class BalsaCarreteiraTest {
	public static void main(String[] args) {

		//tecla de atalho para mudar os mesmos nomes = alt + shift + r

		BalsaCarreteira bc1 = new BalsaCarreteira("Yamato01", 1000, 80, 20, 2, 20, true);
		System.out.println(bc1);

		BalsaCarreteira bc2 = new BalsaCarreteira("Yamato02", 2000, 60, 10, 1, 30, false);
		System.out.println(bc2);

		BalsaCarreteira b3 = new BalsaCarreteira("Yamato03", 3000, 20, 5, 1, 40, true);
		System.out.println(b3);
	}
}