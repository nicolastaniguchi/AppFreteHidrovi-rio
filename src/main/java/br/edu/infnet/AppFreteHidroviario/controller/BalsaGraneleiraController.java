package br.edu.infnet.AppFreteHidroviario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppFreteHidroviario.model.domain.BalsaGraneleira;

@Controller
public class BalsaGraneleiraController {
	
	
	@GetMapping(value = "/balsaGraneleira")	
	public String telaCadastro() {
		
		return "cliente/cadastro";
	
	}
	
	@PostMapping(value = "/balsaGraneleira/incluir")
	public String incluir(BalsaGraneleira balsagraneleira) {
		System.out.println("Inclusão realizada com sucesso!!");
		
		return "redirect:/";
	}

}
