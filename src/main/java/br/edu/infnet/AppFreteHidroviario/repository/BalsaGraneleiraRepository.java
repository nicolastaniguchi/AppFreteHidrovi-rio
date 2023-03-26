package br.edu.infnet.AppFreteHidroviario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppFreteHidroviario.model.domain.BalsaGraneleira;

@Repository
public interface BalsaGraneleiraRepository extends CrudRepository<BalsaGraneleira, Integer>{

	@Query("from BalsaGraneleira b where b.usuario.id = :userId")
	List<BalsaGraneleira> obterLista(Integer userId);
}
