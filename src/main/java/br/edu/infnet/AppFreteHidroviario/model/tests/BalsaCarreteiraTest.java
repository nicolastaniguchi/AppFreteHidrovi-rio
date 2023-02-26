package br.edu.infnet.AppFreteHidroviario.model.tests;

import br.edu.infnet.AppFreteHidroviario.model.domain.BalsaCarreteira;

public class BalsaCarreteiraTest {
	public static void main(String[] args) {
		
		//tecla de atalho para mudar os mesmos nomes = alt + shift + r
		
		BalsaCarreteira bc1 = new BalsaCarreteira(1, "Yamato01", 1000, 80, 20, 2);
		bc1.setSegurancas(false);
		bc1.setQtdeFrotas(37);
		System.out.println(bc1);
		
		BalsaCarreteira bc2 = new BalsaCarreteira(2, "Yamato02", 2000, 60, 10, 1);
		bc2.setSegurancas(true);
		bc2.setQtdeFrotas(26);
		System.out.println(bc2);
		
		BalsaCarreteira b3 = new BalsaCarreteira(3, "Yamato03", 3000, 20, 5, 1);
		b3.setSegurancas(true);
		b3.setQtdeFrotas(19);
		System.out.println(b3);
	}
}
