package br.gov.cursojsf.bean;

import java.io.Serializable;

public class OlaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
