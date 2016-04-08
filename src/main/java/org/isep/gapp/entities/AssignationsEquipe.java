package org.isep.gapp.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class AssignationsEquipe implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idAssignationsEquipe;
	@ManyToOne
	@JoinColumn(name="id_utilisateur")
	private Utilisateur utilisateur;
	@ManyToOne
	@JoinColumn(name="id_equipe")
	private Equipe equipe;
	
	public AssignationsEquipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AssignationsEquipe(long idAssignationsEquipe, Utilisateur utilisateur, Equipe equipe) {
		super();
		this.idAssignationsEquipe = idAssignationsEquipe;
		this.utilisateur = utilisateur;
		this.equipe = equipe;
	}
	public long getIdAssignationsEquipe() {
		return idAssignationsEquipe;
	}
	public void setIdAssignationsEquipe(long idAssignationsEquipe) {
		this.idAssignationsEquipe = idAssignationsEquipe;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	

}
