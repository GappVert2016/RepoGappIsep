package org.okongo.gapptest.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utilisateur implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idUtilisateur;
	private String identifiantLDAP;
	private String email;
	private String nomUtilisateur;
	private String prenomUtilisateur;
	private String role;
	
	
	public Utilisateur(long idUtilisateur, String identifiantLDAP, String email, String nomUtilisateur,
			String prenomUtilisateur, String role) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.identifiantLDAP = identifiantLDAP;
		this.email = email;
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.role = role;
	}

	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getIdentifiantLDAP() {
		return identifiantLDAP;
	}

	public void setIdentifiantLDAP(String identifiantLDAP) {
		this.identifiantLDAP = identifiantLDAP;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}

	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	

}
