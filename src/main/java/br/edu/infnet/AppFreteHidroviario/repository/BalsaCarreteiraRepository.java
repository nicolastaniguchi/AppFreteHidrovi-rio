package br.edu.infnet.AppFreteHidroviario.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppFreteHidroviario.model.domain.BalsaCarreteira;

@Repository
public interface BalsaCarreteiraRepository extends CrudRepository<BalsaCarreteira, Integer>{

	@Query("from BalsaCarreteira b where b.usuario.id = :userId")
	List<BalsaCarreteira> obterLista(Integer userId);
}
