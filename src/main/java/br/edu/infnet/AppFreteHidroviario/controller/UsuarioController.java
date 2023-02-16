package br.edu.infnet.AppFreteHidroviario.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppFreteHidroviario.model.domain.Usuario;
import br.edu.infnet.AppFreteHidroviario.repository.UsuarioRepository;

@Controller
public class UsuarioController {
	
	@GetMapping(value = "/usuario")	
	public String telaCadastro() {
		
		return "usuario/cadastro";
	
	}
	
	@GetMapping(value = "/usuario/lista")	
	public String telaLista() {
		
		List<Usuario> lista = UsuarioRepository.obterLista();
		
		System.out.println("Quantidade de usuários = " + lista.size());
		
		for(Usuario user : lista) {
			System.out.println("A inclusão do usuário " + user.getNome() + ", com o email: "+ user.getEmail() + " foi realizada com sucesso.");
		}
		
		return "usuario/lista";
	
	}
	
	@PostMapping(value = "/usuario/incluir")
	public String incluir(Usuario usuario) {
		
		UsuarioRepository.incluir(usuario);
		
		return "redirect:/usuario/lista";
	}

	

}
