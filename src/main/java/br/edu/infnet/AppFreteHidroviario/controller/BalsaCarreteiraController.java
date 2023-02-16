package br.edu.infnet.AppFreteHidroviario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppFreteHidroviario.model.domain.BalsaCarreteira;

@Controller
public class BalsaCarreteiraController {
	
	@GetMapping(value = "/balsacarreteira")	
	public String telaCadastro() {
		
		return "balsacarreteira/cadastro";
	
	}
	
	@PostMapping(value = "/balsacarreteira/incluir")
	public String incluir(BalsaCarreteira balsacarreteira) {
		System.out.println("Inclusão realizada com sucesso!!");
		
		return "redirect:/";
	}

}
