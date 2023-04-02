package br.edu.infnet.AppFreteHidroviario.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppFreteHidroviario.clients.IEnderecoClient;
import br.edu.infnet.AppFreteHidroviario.model.domain.Endereco;

@Service
public class EnderecoService {
	
	@Autowired
	private IEnderecoClient enderecoClient;
	
	public Endereco procurarPorCep(String cep) {

		return enderecoClient.procurarPorCep(cep);
	}

}
