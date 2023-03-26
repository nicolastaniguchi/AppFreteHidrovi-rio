package br.edu.infnet.AppFreteHidroviario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppFreteHidroviario.model.domain.Empurrador;

@Repository
public interface EmpurradorRepository extends CrudRepository<Empurrador, Integer>{

	@Query("from Empurrador e where e.usuario.id = :userId")
	List<Empurrador> obterLista(Integer userId);
}
