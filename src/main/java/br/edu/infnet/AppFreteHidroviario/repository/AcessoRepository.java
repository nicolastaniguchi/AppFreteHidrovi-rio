package br.edu.infnet.AppFreteHidroviario.repository;

import br.edu.infnet.AppFreteHidroviario.model.domain.Usuario;

public class AcessoRepository {
	
	public static Usuario autenticar(Usuario usuario) {
		
		if(usuario.getEmail().equalsIgnoreCase(usuario.getSenha())) {
			return new Usuario("Administrador", usuario.getEmail(), usuario.getSenha());
		}
		return null;
	}
	

}
