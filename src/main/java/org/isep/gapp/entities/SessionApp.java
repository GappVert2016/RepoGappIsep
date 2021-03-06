package org.isep.gapp.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class SessionApp implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idApp;
	private String nomSessionApp;
	private String descriptionApp;
	@ManyToOne
	@JoinColumn(name="idUtilisateur")
	private Utilisateur utilisateur;
	@OneToMany(mappedBy="sessionAppEquipe")
	private Collection<Equipe> equipes;
	@OneToMany(mappedBy="sessionApp")
	private Collection<FamilleCompetence> famicomps;
	
	

	public SessionApp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SessionApp(String nomSessionApp, String descriptionApp, Utilisateur utilisateur) {
		super();
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

	public Collection<Equipe> getEquipes() {
		return equipes;
	}

	public void setEquipes(Collection<Equipe> equipes) {
		this.equipes = equipes;
	}

	public Collection<FamilleCompetence> getFamicomps() {
		return famicomps;
	}

	public void setFamicomps(Collection<FamilleCompetence> famicomps) {
		this.famicomps = famicomps;
	}
	
		

}
