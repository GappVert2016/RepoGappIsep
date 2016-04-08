package org.isep.gapp.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class FamilleCompetence implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idFamille;
	private String nomFamille;
	@ManyToOne
	@JoinColumn(name="id_SessionApp")
	private SessionApp sessionApp;
	public FamilleCompetence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FamilleCompetence(long idFamille, String nomFamille, SessionApp sessionApp) {
		super();
		this.idFamille = idFamille;
		this.nomFamille = nomFamille;
		this.sessionApp = sessionApp;
	}
	public long getIdFamille() {
		return idFamille;
	}
	public void setIdFamille(long idFamille) {
		this.idFamille = idFamille;
	}
	public String getNomFamille() {
		return nomFamille;
	}
	public void setNomFamille(String nomFamille) {
		this.nomFamille = nomFamille;
	}
	public SessionApp getSessionApp() {
		return sessionApp;
	}
	public void setSessionApp(SessionApp sessionApp) {
		this.sessionApp = sessionApp;
	}
	
	

}
