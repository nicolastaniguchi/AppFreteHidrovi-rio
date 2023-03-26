package br.edu.infnet.AppFreteHidroviario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.AppFreteHidroviario.model.domain.Embarcacoes;
import br.edu.infnet.AppFreteHidroviario.model.domain.Usuario;
import br.edu.infnet.AppFreteHidroviario.service.EmbarcacoesService;

@Controller
public class EmbarcacoesController {

	@Autowired
	private EmbarcacoesService embarcacoesService;

	private String msg;


	@GetMapping(value = "/embarcacoes/lista")
	public String telaLista(Model model, @SessionAttribute("usuario") Usuario usuario) {

		model.addAttribute("embarcacoes", embarcacoesService.obterLista(usuario));

		model.addAttribute("mensagem", msg);

		msg = null;

		return "embarcacoes/lista";

	}


	@GetMapping(value = "/embarcacoes/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		Embarcacoes embarcacoes = embarcacoesService.obterId(id);

		embarcacoesService.excluir(id);

		msg = "A exclusão da embarcação "+ embarcacoes.getNome() +" foi realizada com sucesso!";

		return "redirect:/embarcacoes/lista";
	}

}
