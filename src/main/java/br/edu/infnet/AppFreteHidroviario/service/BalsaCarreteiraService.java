package br.edu.infnet.AppFreteHidroviario.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppFreteHidroviario.model.domain.BalsaCarreteira;
import br.edu.infnet.AppFreteHidroviario.repository.BalsaCarreteiraRepository;

@Service
public class BalsaCarreteiraService {

	@Autowired
	private BalsaCarreteiraRepository balsaCarreteiraRepository;
	
	public boolean incluir(BalsaCarreteira balsaCarreteira) {
		return balsaCarreteiraRepository.incluir(balsaCarreteira);
	}
	
	public BalsaCarreteira excluir(Integer key) {
		return balsaCarreteiraRepository.excluir(key);
	}
	
	public Collection<BalsaCarreteira> obterLista(){
		return balsaCarreteiraRepository.obterLista();
	}
}
