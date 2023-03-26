package br.edu.infnet.AppFreteHidroviario.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppFreteHidroviario.model.domain.Embarcacoes;
import br.edu.infnet.AppFreteHidroviario.model.domain.Usuario;
import br.edu.infnet.AppFreteHidroviario.repository.EmbarcacoesRepository;

@Service
public class EmbarcacoesService {

	@Autowired
	private EmbarcacoesRepository embarcacoesRepository;

	public void excluir(Integer id) {
		embarcacoesRepository.deleteById(id);
	}

	public Collection<Embarcacoes> obterLista(){
		return (Collection<Embarcacoes>) embarcacoesRepository.findAll();
	}

	public Collection<Embarcacoes> obterLista(Usuario usuario){
		return embarcacoesRepository.obterLista(usuario.getId());
	}

	public Embarcacoes obterId(Integer id){
		return embarcacoesRepository.findById(id).orElse(null);
	}
}
