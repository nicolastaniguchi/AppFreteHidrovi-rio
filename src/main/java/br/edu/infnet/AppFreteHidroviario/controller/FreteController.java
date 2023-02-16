package br.edu.infnet.AppFreteHidroviario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppFreteHidroviario.model.domain.Frete;

@Controller
public class FreteController {
	
	
	@GetMapping(value = "/frete")	
	public String telaCadastro() {
		
		return "frete/cadastro";
	
	}
	
	@PostMapping(value = "/frete/incluir")
	public String incluir(Frete frete) {
		System.out.println("Inclusão realizada:" + frete);
		
		return "redirect:/";
	}

}
