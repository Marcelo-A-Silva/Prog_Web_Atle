package progweb.quarta.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import progweb.quarta.domain.Competicao;
import progweb.quarta.repositories.CompeticaoRepository;

@Service
public class CompeticaoService {

	@Autowired
	private CompeticaoRepository comprep;
	

	public Competicao find(Integer id) {
		Optional<Competicao> obj = comprep.findById(id);
		return obj.orElse(null);
	}

}
