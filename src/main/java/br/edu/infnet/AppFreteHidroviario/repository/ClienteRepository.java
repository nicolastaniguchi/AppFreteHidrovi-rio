package br.edu.infnet.AppFreteHidroviario.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.AppFreteHidroviario.model.domain.Cliente;

@Repository
public class ClienteRepository {
	
	private static Integer id = 1;
	
	private static Map<Integer, Cliente> mapaCliente = new HashMap<Integer, Cliente>();
	
	public boolean incluir(Cliente cliente) {
		
		cliente.setId(id++);
		
		try {
			mapaCliente.put(cliente.getId(), cliente);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Cliente excluir(Integer key) {

		return mapaCliente.remove(key);
	}
	
	public Collection<Cliente> obterLista(){
		return mapaCliente.values();
	}
}
