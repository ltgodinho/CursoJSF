package br.gov.cursojsf.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

@ManagedBean(name="cadastroBean")
@RequestScoped
public class CadastroBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	
	private String email;
	
	private Date dataNascimento;
	
	private String bairro;
	
	private List<SelectItem> listaBairros;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public List<SelectItem> getListaBairros() {
		listaBairros = new ArrayList<SelectItem>();
	
		SelectItem item = new SelectItem();
		item.setValue("BOTAFOGO");
		item.setLabel("BOTAFOGO");
		
		this.listaBairros.add(item);
		
		return listaBairros;
	}

}