package br.edu.infnet.AppFreteHidroviario.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppFreteHidroviario.model.domain.Empurrador;
import br.edu.infnet.AppFreteHidroviario.model.domain.Usuario;
import br.edu.infnet.AppFreteHidroviario.repository.EmpurradorRepository;

@Service
public class EmpurradorService {

	@Autowired
	private EmpurradorRepository empurradorRepository;

	public Empurrador incluir(Empurrador empurrador) {
		return empurradorRepository.save(empurrador);
	}

	public void excluir(Integer id) {
		empurradorRepository.deleteById(id);
	}

	public Collection<Empurrador> obterLista(){
		return (Collection<Empurrador>) empurradorRepository.findAll();
	}

	public Collection<Empurrador> obterLista(Usuario usuario){
		return empurradorRepository.obterLista(usuario.getId());
	}

	public Empurrador obterId(Integer id){
		return empurradorRepository.findById(id).orElse(null);
	}
}
