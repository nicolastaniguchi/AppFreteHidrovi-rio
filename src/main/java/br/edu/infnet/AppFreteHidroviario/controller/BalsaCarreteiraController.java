package br.edu.infnet.AppFreteHidroviario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.AppFreteHidroviario.model.domain.BalsaCarreteira;
import br.edu.infnet.AppFreteHidroviario.model.domain.Usuario;
import br.edu.infnet.AppFreteHidroviario.service.BalsaCarreteiraService;

@Controller
public class BalsaCarreteiraController {

	@Autowired
	private BalsaCarreteiraService balsaCarreteiraService;

	private String msg;

	@GetMapping(value = "/balsacarreteira")
	public String telaCadastro() {

		return "balsacarreteira/cadastro";
	}

	@GetMapping(value = "/balsacarreteira/lista")
	public String telaLista(Model model, @SessionAttribute("usuario") Usuario usuario) {

		model.addAttribute("balsaCarreteira", balsaCarreteiraService.obterLista(usuario));

		model.addAttribute("mensagem", msg);

		msg = null;

		return "balsacarreteira/lista";

	}

	@PostMapping(value = "/balsacarreteira/incluirbc")
	public String incluirBalsaCarreteira(BalsaCarreteira balsaCarreteira,
			@SessionAttribute("usuario") Usuario usuario) {

		balsaCarreteira.setUsuario(usuario);

		balsaCarreteiraService.incluir(balsaCarreteira);

		msg = "A inclusão da embarcação " + balsaCarreteira.getNome() + " foi realizada com sucesso!";

		return "redirect:/balsacarreteira/lista";
	}

	@GetMapping(value = "/balsacarreteira/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		BalsaCarreteira balsacarreteira = balsaCarreteiraService.obterId(id);

		balsaCarreteiraService.excluir(id);

		msg = "A exclusão da embarcação " + balsacarreteira.getNome() + " foi realizada com sucesso!";

		return "redirect:/balsacarreteira/lista";
	}

}
