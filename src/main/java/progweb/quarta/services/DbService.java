package progweb.quarta.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import progweb.quarta.domain.Atleta;
import progweb.quarta.domain.Competicao;
import progweb.quarta.repositories.AtletaRepository;
import progweb.quarta.repositories.CompeticaoRepository;

@Service
public class DbService {
	
	@Autowired
	private AtletaRepository atletaRepository;
	
	@Autowired
	private CompeticaoRepository competicaoRepository;
	
	public void inicializaBancoDeDados() throws ParseException {
		
		Competicao com1 = new Competicao(null, "Bacon", "22/03/2019");
		Competicao com2 = new Competicao(null, "Churros", "09/04/2019");
		Competicao com3 = new Competicao(null, "X-slad", "10/04/2019");
		
		
		Atleta atl1 = new Atleta(null, "Jõao");
		atl1.getModalidades().add("Bacon");
		atl1.getModalidades().add("Churros");
		atl1.getCompeticoes().addAll(Arrays.asList(com1, com2));
		
		Atleta atl2 = new Atleta(null, "Jonas");
		atl2.getModalidades().add("Bacon");
		atl2.getModalidades().add("X-slad");
		atl2.getCompeticoes().addAll(Arrays.asList(com1, com3));
		
		Atleta atl3 = new Atleta(null, "Josias");
		atl3.getModalidades().add("Churros");
		atl3.getModalidades().add("X-slad");
		atl3.getCompeticoes().addAll(Arrays.asList(com2, com3));
		
		Atleta atl4 = new Atleta(null, "Josiane");
		atl4.getModalidades().add("Bacon");
		atl4.getModalidades().add("X-slad");
		atl4.getCompeticoes().addAll(Arrays.asList(com1, com3));
		
		Atleta atl5 = new Atleta(null, "Jony");
		atl5.getModalidades().add("Churros");
		atl5.getModalidades().add("X-slad");
		atl5.getCompeticoes().addAll(Arrays.asList(com2, com3));
		
		competicaoRepository.saveAll(Arrays.asList(com1,com2,com3));
		atletaRepository.saveAll(Arrays.asList(atl1,atl2,atl3,atl4));
	
	}
	
}
