package br.edu.infnet.AppFreteHidroviario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.AppFreteHidroviario.model.domain.Empurrador;
import br.edu.infnet.AppFreteHidroviario.model.domain.Usuario;
import br.edu.infnet.AppFreteHidroviario.service.EmpurradorService;

@Controller
public class EmpurradorController {

	@Autowired
	private EmpurradorService empurradorService;

	private String msg;

	@GetMapping(value = "/empurrador")
	public String telaCadastro() {

		return "empurrador/cadastro";
	}

	@GetMapping(value = "/empurrador/lista")
	public String telaLista(Model model, @SessionAttribute("usuario") Usuario usuario) {

		model.addAttribute("empurrador", empurradorService.obterLista(usuario));

		model.addAttribute("mensagem", msg);

		msg = null;

		return "empurrador/lista";

	}

	@PostMapping(value = "/empurrador/incluire")
	public String incluirEmpurrador(Empurrador empurrador, @SessionAttribute("usuario") Usuario usuario) {

		empurrador.setUsuario(usuario);

		empurradorService.incluir(empurrador);

		msg = "A inclusão da embarcação " + empurrador.getNome() + " foi realizada com sucesso!";

		return "redirect:/empurrador/lista";
	}

	@GetMapping(value = "/empurrador/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		Empurrador empurrador = empurradorService.obterId(id);

		empurradorService.excluir(id);

		msg = "A exclusão da embarcação "+ empurrador.getNome() +" foi realizada com sucesso!";

		return "redirect:/empurrador/lista";
	}

}
