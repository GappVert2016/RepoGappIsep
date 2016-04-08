package org.isep.gapp.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Equipe implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idEquipe;
	private String nomEquipe;
	@ManyToOne
	@JoinColumn(name="idSessionApp")
	private SessionApp sessionAppEquipe;
	
	public Equipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Equipe(long idEquipe, String nomEquipe, SessionApp sessionAppEquipe) {
		super();
		this.idEquipe = idEquipe;
		this.nomEquipe = nomEquipe;
		this.sessionAppEquipe = sessionAppEquipe;
	}
	public long getIdEquipe() {
		return idEquipe;
	}
	public void setIdEquipe(long idEquipe) {
		this.idEquipe = idEquipe;
	}
	public String getNomEquipe() {
		return nomEquipe;
	}
	public void setNomEquipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}
	public SessionApp getSessionAppEquipe() {
		return sessionAppEquipe;
	}
	public void setSessionAppEquipe(SessionApp sessionAppEquipe) {
		this.sessionAppEquipe = sessionAppEquipe;
	}
	
	

}
