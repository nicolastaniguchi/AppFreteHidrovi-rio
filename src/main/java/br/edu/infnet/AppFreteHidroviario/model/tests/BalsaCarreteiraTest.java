package br.edu.infnet.AppFreteHidroviario.model.tests;

import br.edu.infnet.AppFreteHidroviario.model.domain.BalsaCarreteira;

public class BalsaCarreteiraTest {
	public static void main(String[] args) {
		
		//tecla de atalho para mudar os mesmos nomes = alt + shift + r
		
		BalsaCarreteira bc1 = new BalsaCarreteira("001", "Yamato01", 1000);
		bc1.setTamanho(80);
		bc1.setSegurancas(false);
		bc1.setQtdeFrotas(37);
		System.out.println(bc1);
		
		BalsaCarreteira bc2 = new BalsaCarreteira("002", "Yamato02", 2000);
		bc2.setTamanho(60);
		bc2.setSegurancas(true);
		bc2.setQtdeFrotas(26);
		System.out.println(bc2);
		
		BalsaCarreteira b3 = new BalsaCarreteira("003", "Yamato03", 3000);
		b3.setTamanho(40);
		b3.setSegurancas(true);
		b3.setQtdeFrotas(19);
		System.out.println(b3);
		
	}

}
