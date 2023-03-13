package br.edu.infnet.AppFreteHidroviario.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.AppFreteHidroviario.model.domain.BalsaGraneleira;

@Repository
public class BalsaGraneleiraRepository {
	
	private static Integer frota = 1;
	
	private static Map<Integer, BalsaGraneleira> mapaBalsaGraneleira = new HashMap<Integer, BalsaGraneleira>();
	
	public boolean incluir(BalsaGraneleira balsaGraneleira) {
		
		balsaGraneleira.setFrota(frota++);
		
		try {
			mapaBalsaGraneleira.put(balsaGraneleira.getFrota(), balsaGraneleira);
			return true;
		} catch (Exception e) { 
			return false;
		}
	}
	
	public BalsaGraneleira excluir(Integer key) {

		return mapaBalsaGraneleira.remove(key);
	}
	
	public Collection<BalsaGraneleira> obterLista(){
		return mapaBalsaGraneleira.values();
	}
}
