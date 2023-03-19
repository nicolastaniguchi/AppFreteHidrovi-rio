package br.edu.infnet.AppFreteHidroviario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppFreteHidroviario.model.domain.Usuario;
import br.edu.infnet.AppFreteHidroviario.service.UsuarioService;

@Order(1)
@Component
public class UsuarioLoader implements ApplicationRunner{

	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Usuario adminUser = new Usuario("Administrador Geral", "adminuser@email.com", "001100");

		usuarioService.incluir(adminUser);

		System.out.println("O usuario " + adminUser.getNome() + " foi incluído com sucesso!");

		for (int i = 0; i < 9; i++) {
			Usuario usuario = new Usuario("Administrador " + i, "ad"+i+"@email.com", "00"+i);

			usuarioService.incluir(usuario);

			System.out.println("O usuario " + usuario.getNome() + " foi incluído com sucesso!");
		}
	}
}