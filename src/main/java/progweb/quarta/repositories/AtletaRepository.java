package progweb.quarta.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import progweb.quarta.domain.Atleta;
import progweb.quarta.domain.Competicao;




@Repository
public interface AtletaRepository extends JpaRepository<Atleta, Integer>{

	List<Atleta> findDistinctByNomeContainingAndCompeticoesIn(
		String nome,
		List<Competicao> competicoes
	);
}

