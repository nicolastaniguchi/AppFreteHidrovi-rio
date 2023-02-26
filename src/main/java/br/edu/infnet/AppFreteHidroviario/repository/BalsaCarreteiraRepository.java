package br.edu.infnet.AppFreteHidroviario.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.edu.infnet.AppFreteHidroviario.model.domain.BalsaCarreteira;

public class BalsaCarreteiraRepository {
	
	private static Integer frota = 1;
	
	private static Map<Integer, BalsaCarreteira> mapaBalsaCarreteira = new HashMap<Integer, BalsaCarreteira>();
	
	public static boolean incluir(BalsaCarreteira balsaCarreteira) {
		
		balsaCarreteira.setFrota(frota++);
		
		try {
			mapaBalsaCarreteira.put(balsaCarreteira.getFrota(), balsaCarreteira);
			return true;
		} catch (Exception e) { 
			return false;
		}
	}
	
	public static BalsaCarreteira excluir(Integer key) {

		return mapaBalsaCarreteira.remove(key);
	}
	
	public static Collection<BalsaCarreteira> obterLista(){
		return mapaBalsaCarreteira.values();
	}
}

