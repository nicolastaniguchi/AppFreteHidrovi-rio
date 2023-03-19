package br.edu.infnet.AppFreteHidroviario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppFreteHidroviario.model.domain.Embarcacoes;

@Controller
public class EmbarcacoesController {


	@GetMapping(value = "/embarcacoes")
	public String telaCadastro() {

		return "embarcacoes/cadastro";

	}

	@PostMapping(value = "/embarcacoes/incluir")
	public String incluir(Embarcacoes embarcacoes) {
		System.out.println("Inclusão realizada com sucesso!!");

		return "redirect:/";
	}

}
