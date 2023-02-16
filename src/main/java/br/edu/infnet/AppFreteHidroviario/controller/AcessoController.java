package br.edu.infnet.AppFreteHidroviario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.AppFreteHidroviario.model.domain.Usuario;
import br.edu.infnet.AppFreteHidroviario.repository.AcessoRepository;

@Controller
public class AcessoController {
	
	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}
	
/*	@PostMapping(value = "/login")
	public String login(Usuario usuario) {
		
		System.out.println("Email " + usuario.getEmail());
		System.out.println("Senha " + usuario.getSenha());
		
		return "redirect:/home";
	}
}
*/
	
	@PostMapping(value = "/login")
	public String login(@RequestParam String email, @RequestParam String senha) {
		
		Usuario user = new Usuario(email, senha);
		
		System.out.println(user);

		if(AcessoRepository.autenticar(user) != null) {
			return "redirect:/home";
		}
		return "redirect:/login";
		
	}
}

//
