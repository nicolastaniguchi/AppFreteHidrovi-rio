package br.edu.infnet.AppFreteHidroviario.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppFreteHidroviario.model.domain.BalsaCarreteira;
import br.edu.infnet.AppFreteHidroviario.model.domain.Usuario;
import br.edu.infnet.AppFreteHidroviario.repository.BalsaCarreteiraRepository;

@Service
public class BalsaCarreteiraService {

	@Autowired
	private BalsaCarreteiraRepository balsaCarreteiraRepository;

	public BalsaCarreteira incluir(BalsaCarreteira balsaCarreteira) {
		return balsaCarreteiraRepository.save(balsaCarreteira);
	}

	public void excluir(Integer id) {
		balsaCarreteiraRepository.deleteById(id);
	}

	public Collection<BalsaCarreteira> obterLista(){
		return (Collection<BalsaCarreteira>) balsaCarreteiraRepository.findAll();
	}

	public Collection<BalsaCarreteira> obterLista(Usuario usuario){
		return balsaCarreteiraRepository.obterLista(usuario.getId());
	}

	public BalsaCarreteira obterId(Integer id){
		return balsaCarreteiraRepository.findById(id).orElse(null);
	}
}