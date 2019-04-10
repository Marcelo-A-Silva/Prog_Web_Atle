package progweb.quarta.dtos;

import java.io.Serializable;
import java.util.ArrayList;

import progweb.quarta.domain.Atleta;

public class AtletaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private ArrayList<String> modalidades = new ArrayList<String>();
	
	public AtletaDTO() {

	}

	public AtletaDTO(Atleta obj) {
		id = obj.getId();
		nome = obj.getNome();
		modalidades = obj.getModalidades();
		
	}
	
	

	public ArrayList<String> getModalidades() {
		return modalidades;
	}

	public void setModalidades(ArrayList<String> modalidades) {
		this.modalidades = modalidades;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AtletaDTO other = (AtletaDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
