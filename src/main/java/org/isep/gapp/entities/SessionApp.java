package org.isep.gapp.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SessionApp implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idApp;
	private String nomSessionApp;
	private String descriptionApp;
	@ManyToOne
	@JoinColumn(name="id_Utilisateur_Respo")
	private Utilisateur utilisateur;
	
	public SessionApp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SessionApp(long idApp, String nomSessionApp, String descriptionApp, Utilisateur utilisateur) {
		super();
		this.idApp = idApp;
		this.nomSessionApp = nomSessionApp;
		this.descriptionApp = descriptionApp;
		this.utilisateur = utilisateur;
	}

	public long getIdApp() {
		return idApp;
	}

	public void setIdApp(long idApp) {
		this.idApp = idApp;
	}

	public String getNomSessionApp() {
		return nomSessionApp;
	}

	public void setNomSessionApp(String nomSessionApp) {
		this.nomSessionApp = nomSessionApp;
	}

	public String getDescriptionApp() {
		return descriptionApp;
	}

	public void setDescriptionApp(String descriptionApp) {
		this.descriptionApp = descriptionApp;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	

}
