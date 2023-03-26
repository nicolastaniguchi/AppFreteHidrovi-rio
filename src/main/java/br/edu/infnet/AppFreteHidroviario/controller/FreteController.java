package br.edu.infnet.AppFreteHidroviario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.AppFreteHidroviario.model.domain.Frete;
import br.edu.infnet.AppFreteHidroviario.model.domain.Usuario;
import br.edu.infnet.AppFreteHidroviario.service.FreteService;

@Controller
public class FreteController {

	@Autowired
	private FreteService freteService;

	private String msg;

	@GetMapping(value = "/frete")
	public String telaCadastro() {

		return "frete/cadastro";
	}

	@GetMapping(value = "/frete/lista")
	public String telaLista(Model model, @SessionAttribute("usuario") Usuario usuario) {

		model.addAttribute("frete", freteService.obterLista(usuario));

		model.addAttribute("mensagem", msg);

		msg = null;

		return "frete/lista";

	}

	@PostMapping(value = "/frete/incluirf")
	public String incluirEmpurrador(Frete frete, @SessionAttribute("usuario") Usuario usuario) {

		frete.setUsuario(usuario);

		freteService.incluir(frete);

		msg = "A inclusão do frete " + frete.getDescricao() + " foi realizada com sucesso!";

		return "redirect:/frete/lista";
	}

	@GetMapping(value = "/frete/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		Frete frete = freteService.obterId(id);

		freteService.excluir(id);

		msg = "A exclusão do frete "+ frete.getDescricao() +" foi realizada com sucesso!";

		return "redirect:/frete/lista";
	}

}
