package br.edu.infnet.AppFreteHidroviario.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppFreteHidroviario.model.domain.Empurrador;
import br.edu.infnet.AppFreteHidroviario.repository.EmpurradorRepository;

@Service
public class EmpurradorService {

	@Autowired
	private EmpurradorRepository empurradorRepository;
	
	public boolean incluir(Empurrador empurrador) {
		return empurradorRepository.incluir(empurrador);
	}
	
	public Empurrador excluir(Integer key) {
		return empurradorRepository.excluir(key);
	}
	
	public Collection<Empurrador> obterLista(){
		return empurradorRepository.obterLista();
	}
	
	
}
