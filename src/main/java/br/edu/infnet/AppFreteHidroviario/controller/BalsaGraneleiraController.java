package br.edu.infnet.AppFreteHidroviario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.AppFreteHidroviario.model.domain.BalsaGraneleira;
import br.edu.infnet.AppFreteHidroviario.model.domain.Usuario;
import br.edu.infnet.AppFreteHidroviario.service.BalsaGraneleiraService;

@Controller
public class BalsaGraneleiraController {

	@Autowired
	private BalsaGraneleiraService balsaGraneleiraService;

	private String msg;


	@GetMapping(value = "/balsagraneleira")
	public String telaCadastro() {

		return "balsagraneleira/cadastro";

	}

	@GetMapping(value = "/balsagraneleira/lista")
	public String telaLista(Model model, @SessionAttribute("usuario") Usuario usuario) {

		model.addAttribute("balsaGraneleira", balsaGraneleiraService.obterLista(usuario));

		model.addAttribute("mensagem", msg);

		msg = null;

		return "balsagraneleira/lista";

	}

	@PostMapping(value = "/balsagraneleira/incluirbg")
	public String incluirBalsaGraneleira(BalsaGraneleira balsaGraneleira, @SessionAttribute("usuario") Usuario usuario) {
		
		balsaGraneleira.setUsuario(usuario);
		
		balsaGraneleiraService.incluir(balsaGraneleira);

		msg = "A inclusão da embarcação " + balsaGraneleira.getNome() +" foi realizada com sucesso!";

		return "redirect:/balsagraneleira/lista";
	}

	@GetMapping(value = "/balsagraneleira/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		BalsaGraneleira balsagraneleira  = balsaGraneleiraService.obterId(id);
				
		balsaGraneleiraService.excluir(id);

		msg = "A exclusão da embarcação " + balsagraneleira.getNome() +" foi realizada com sucesso!";

		return "redirect:/balsagraneleira/lista";
	}
}
