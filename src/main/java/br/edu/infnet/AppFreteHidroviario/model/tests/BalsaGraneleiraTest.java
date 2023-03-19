package br.edu.infnet.AppFreteHidroviario.model.tests;

import br.edu.infnet.AppFreteHidroviario.model.domain.BalsaGraneleira;

public class BalsaGraneleiraTest {
	public static void main(String[] args) {

		BalsaGraneleira bg1 = new BalsaGraneleira("Yamato01", 1000, 80, 20, 2, false, "racked", 2500);
		System.out.println(bg1);

		BalsaGraneleira bg2 = new BalsaGraneleira("Yamato02", 2000, 60, 10, 1, true, "box", 3000);
		System.out.println(bg2);

		BalsaGraneleira bg3 = new BalsaGraneleira("Yamato03", 3000, 40, 50, 1, false, "racked", 4000);
		System.out.println(bg3);
	}
}
