package br.edu.infnet.AppFreteHidroviario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppFreteHidroviario.model.domain.Empurrador;

@Controller
public class EmpurradorController {
	
	
	@GetMapping(value = "/empurrador")	
	public String telaCadastro() {
		
		return "empurrador/cadastro";
	
	}
	
	@PostMapping(value = "/empurrador/incluir")
	public String incluir(Empurrador empurrador) {
		System.out.println("Inclusão realizada com sucesso!!");
		
		return "redirect:/";
	}

}
