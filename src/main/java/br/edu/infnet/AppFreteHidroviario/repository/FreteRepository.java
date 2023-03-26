package br.edu.infnet.AppFreteHidroviario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppFreteHidroviario.model.domain.Frete;

@Repository
public interface FreteRepository extends CrudRepository<Frete, Integer>{
	@Query("from Frete f where f.usuario.id = :userId")
	List<Frete> obterLista(Integer userId);
}