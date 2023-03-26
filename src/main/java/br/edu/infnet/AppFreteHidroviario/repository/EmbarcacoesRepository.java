package br.edu.infnet.AppFreteHidroviario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppFreteHidroviario.model.domain.Embarcacoes;

@Repository
public interface EmbarcacoesRepository extends CrudRepository<Embarcacoes, Integer>{

	@Query("from Embarcacoes eb where eb.usuario.id = :userId")
	List<Embarcacoes> obterLista(Integer userId);
}
