package br.edu.infnet.AppFreteHidroviario.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.AppFreteHidroviario.model.domain.Empurrador;

@Repository
public class EmpurradorRepository {
	
	private static Integer frota = 1;
	
	private static Map<Integer, Empurrador> mapaEmpurrador = new HashMap<Integer, Empurrador>();
	
	public boolean incluir(Empurrador empurrador) {
		
		empurrador.setFrota(frota++);
		
		try {
			mapaEmpurrador.put(empurrador.getFrota(), empurrador);
			return true;
		} catch (Exception e) { 
			return false;
		}
	}
	
	public Empurrador excluir(Integer key) {

		return mapaEmpurrador.remove(key);
	}
	
	public Collection<Empurrador> obterLista(){
		return mapaEmpurrador.values();
	}
}
