package br.edu.infnet.AppFreteHidroviario.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppFreteHidroviario.model.domain.BalsaGraneleira;
import br.edu.infnet.AppFreteHidroviario.model.domain.Usuario;
import br.edu.infnet.AppFreteHidroviario.repository.BalsaGraneleiraRepository;

@Service
public class BalsaGraneleiraService {

	@Autowired
	private BalsaGraneleiraRepository balsaGraneleiraRepository;

	public BalsaGraneleira incluir(BalsaGraneleira balsaGraneleira) {
		return balsaGraneleiraRepository.save(balsaGraneleira);
	}

	public void excluir(Integer id) {
		balsaGraneleiraRepository.deleteById(id);
	}

	public Collection<BalsaGraneleira> obterLista(){
		return (Collection<BalsaGraneleira>) balsaGraneleiraRepository.findAll();
	}

	public Collection<BalsaGraneleira> obterLista(Usuario usuario){
		return balsaGraneleiraRepository.obterLista(usuario.getId());
	}

	public BalsaGraneleira obterId(Integer id){
		return balsaGraneleiraRepository.findById(id).orElse(null);
	}
}
