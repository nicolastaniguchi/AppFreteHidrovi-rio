package br.edu.infnet.AppFreteHidroviario.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppFreteHidroviario.model.domain.Frete;
import br.edu.infnet.AppFreteHidroviario.model.domain.Usuario;
import br.edu.infnet.AppFreteHidroviario.repository.FreteRepository;

@Service
public class FreteService {

	@Autowired
	private FreteRepository freteRepository;

	public Frete incluir(Frete frete) {
		return freteRepository.save(frete);
	}

	public void excluir(Integer id) {
		freteRepository.deleteById(id);
	}

	public Collection<Frete> obterLista(){
		return (Collection<Frete>) freteRepository.findAll();
	}

	public Collection<Frete> obterLista(Usuario usuario){
		return freteRepository.obterLista(usuario.getId());
	}

	public Frete obterId(Integer id){
		return freteRepository.findById(id).orElse(null);
	}
}
