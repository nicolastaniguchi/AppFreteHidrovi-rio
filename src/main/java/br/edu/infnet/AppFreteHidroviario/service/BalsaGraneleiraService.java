package br.edu.infnet.AppFreteHidroviario.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppFreteHidroviario.model.domain.BalsaGraneleira;
import br.edu.infnet.AppFreteHidroviario.repository.BalsaGraneleiraRepository;

@Service
public class BalsaGraneleiraService {

	@Autowired
	private BalsaGraneleiraRepository balsaGraneleiraRepository;

	public boolean incluir(BalsaGraneleira balsaGraneleira) {
		return balsaGraneleiraRepository.incluir(balsaGraneleira);
	}

	public BalsaGraneleira excluir(Integer key) {
		return balsaGraneleiraRepository.excluir(key);
	}

	public Collection<BalsaGraneleira> obterLista(){
		return balsaGraneleiraRepository.obterLista();
	}


}
