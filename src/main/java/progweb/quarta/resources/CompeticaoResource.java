package progweb.quarta.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import progweb.quarta.domain.Competicao;
import progweb.quarta.services.CompeticaoService;

@RestController
@RequestMapping(value="/competicoes")
public class CompeticaoResource {

	@Autowired
	private CompeticaoService service;
	
	@RequestMapping(value = "/{cod}", method = RequestMethod.GET)
	public ResponseEntity<Competicao> find(@PathVariable Integer cod) {
		Competicao obj = service.find(cod);
		return ResponseEntity.ok().body(obj);
	}
}
