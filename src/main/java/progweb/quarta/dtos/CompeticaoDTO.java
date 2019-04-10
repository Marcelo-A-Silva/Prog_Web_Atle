package progweb.quarta.dtos;

import java.io.Serializable;

import progweb.quarta.domain.Competicao;

public class CompeticaoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer cod;
	private String descric;
	private String data;
	
	
	public CompeticaoDTO() {
		
	}
	
	public CompeticaoDTO(Competicao obj) {
		cod = obj.getCod();
		descric = obj.getDescric();
		data = obj.getData();
	}
	
	
	public Integer getCod() {
		return cod;
	}
	public void setCod(Integer cod) {
		this.cod = cod;
	}
	public String getDescric() {
		return descric;
	}
	public void setDescric(String descric) {
		this.descric = descric;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}



}
