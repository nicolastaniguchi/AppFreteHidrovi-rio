package br.edu.infnet.AppFreteHidroviario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppFreteHidroviario.model.domain.BalsaGraneleira;
import br.edu.infnet.AppFreteHidroviario.repository.BalsaGraneleiraRepository;

@Controller
public class BalsaGraneleiraController {
	
	private String msg;
	
	
	@GetMapping(value = "/balsagraneleira")	
	public String telaCadastro() {
		
		return "balsagraneleira/cadastro";
	
	}
	
	@GetMapping(value = "/balsagraneleira/lista")	
	public String telaLista(Model model) {
		
		model.addAttribute("balsaGraneleira", BalsaGraneleiraRepository.obterLista());
		
		model.addAttribute("mensagem", msg);
		
		msg = null;
		
		return "balsagraneleira/lista";
	
	}
	
	@PostMapping(value = "/balsagraneleira/incluirbg")
	public String incluirBalsaGraneleira(BalsaGraneleira balsagraneleira) {
		
		BalsaGraneleiraRepository.incluir(balsagraneleira);
		
		msg = "A inclusão da embarcação " + balsagraneleira.getNome() +" foi realizada com sucesso!";
		
		return "redirect:/balsagraneleira/lista";
	}
	
	@GetMapping(value = "/balsagraneleira/{frota}/excluir")
	public String excluir(@PathVariable Integer frota) {

		BalsaGraneleira balsagraneleira  = BalsaGraneleiraRepository.excluir(frota);
		
		msg = "A exclusão da embarcação " + balsagraneleira.getNome() +" foi realizada com sucesso!";
		
		return "redirect:/balsagraneleira/lista";
	}
}
