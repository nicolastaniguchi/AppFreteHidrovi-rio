package br.edu.infnet.AppFreteHidroviario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.AppFreteHidroviario.service.EnderecoService;

@Controller
public class EnderecoController {
	
	@Autowired
	private EnderecoService enderecoService;
	
	@PostMapping(value="/cep")
	public String procurarCep(Model model, @RequestParam String cep) {

		model.addAttribute("endereco", enderecoService.procurarPorCep(cep));
		return "usuario/cadastro";
	}
	
}
