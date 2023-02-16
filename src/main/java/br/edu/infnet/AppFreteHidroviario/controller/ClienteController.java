package br.edu.infnet.AppFreteHidroviario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppFreteHidroviario.model.domain.Cliente;

@Controller
public class ClienteController {
	
	@GetMapping(value = "/cliente")	
	public String telaCadastro() {
		
		return "cliente/cadastro";
	
	}
	
	@PostMapping(value = "/cliente/incluir")
	public String incluir(Cliente cliente) {
		System.out.println("Inclusão realizada com sucesso!!");
		
		return "redirect:/";
	}
	
}
