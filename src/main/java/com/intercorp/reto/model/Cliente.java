package com.intercorp.reto.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTE")
public class Cliente {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="nom_cli")
	private String nomCli;
	
	@Column(name="ape_cli")
	private String apeCli;
	
	@Column(name="edad_cli")
	private int edadCli;
	
	@Column(name="fecnac_cli")
	private String fecNacCli;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomCli() {
		return nomCli;
	}

	public void setNomCli(String nomCli) {
		this.nomCli = nomCli;
	}

	public String getApeCli() {
		return apeCli;
	}

	public void setApeCli(String apeCli) {
		this.apeCli = apeCli;
	}

	public int getEdadCli() {
		return edadCli;
	}

	public void setEdadCli(int edadCli) {
		this.edadCli = edadCli;
	}

	public String getFecNacCli() {
		return fecNacCli;
	}

	public void setFecNacCli(String fecNacCli) {
		this.fecNacCli = fecNacCli;
	}
	
	
}
