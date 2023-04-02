package br.edu.infnet.AppFreteHidroviario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.AppFreteHidroviario.model.domain.Cliente;
import br.edu.infnet.AppFreteHidroviario.model.domain.Endereco;
import br.edu.infnet.AppFreteHidroviario.model.domain.Usuario;
import br.edu.infnet.AppFreteHidroviario.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	private String msg;

	@GetMapping(value = "/cliente")
	public String telaCadastro() {

		return "cliente/cadastro";

	}

	@GetMapping(value = "/cliente/lista")
	public String telaLista(Model model, @SessionAttribute("usuario") Usuario usuario) {

		model.addAttribute("cliente", clienteService.obterLista(usuario));

		model.addAttribute("mensagem", msg);

		msg = null;

		return "cliente/lista";
	}

	@PostMapping(value = "/cliente/incluir")
	public String incluir(Cliente cliente, Endereco endereco, @SessionAttribute("usuario") Usuario usuario) {

		cliente.setUsuario(usuario);

		cliente.setEndereco(endereco);

		clienteService.incluir(cliente);

		msg = "A inclusão do cliente " + cliente.getNome() + " foi realizada com sucesso!";

		return "redirect:/cliente/lista";
	}

	@GetMapping(value = "/cliente/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		try {

			clienteService.excluir(id);

			msg = "A exclusão do cliente (" + id + ") foi realizada com sucesso!";

		} catch (Exception e) {
			msg = "Não é possível realizar a exclusão do cliente:("+id+")";
		}

		return "redirect:/cliente/lista";
	}
}
