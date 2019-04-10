package progweb.quarta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import progweb.quarta.domain.Competicao;

@Repository
public interface CompeticaoRepository extends JpaRepository<Competicao, Integer>{

}
