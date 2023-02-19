package br.edu.infnet.AppFreteHidroviario.model.tests;

import br.edu.infnet.AppFreteHidroviario.model.domain.Usuario;

public class UsuarioTest {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario("Nicolas", "nicolas@email.com", "123456");
		System.out.println(u1);
		
		Usuario u2 = new Usuario("Nicolas", "nicolas@email.com", "123456");
		System.out.println(u2);
		
		Usuario u3 = new Usuario("Nicolas", "nicolas@email.com", "123456");
		System.out.println(u3);
	}

}
