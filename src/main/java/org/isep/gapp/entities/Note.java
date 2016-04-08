package org.isep.gapp.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Note implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idNote;
	private long valeurNote;
	private String commentaire;
	private Date dateNote;
	@ManyToOne
	@JoinColumn(name="id_Competence")
	private Competence comptence;
	@ManyToOne
	@JoinColumn(name="id_equipe")
	private Equipe equipe;
	@ManyToOne
	@JoinColumn(name="id_utiisateur")
	private Utilisateur utilisateur;
	
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Note(long idNote, long valeurNote, String commentaire, Date dateNote, Competence comptence, Equipe equipe,
			Utilisateur utilisateur) {
		super();
		this.idNote = idNote;
		this.valeurNote = valeurNote;
		this.commentaire = commentaire;
		this.dateNote = dateNote;
		this.comptence = comptence;
		this.equipe = equipe;
		this.utilisateur = utilisateur;
	}
	public long getIdNote() {
		return idNote;
	}
	public void setIdNote(long idNote) {
		this.idNote = idNote;
	}
	public long getValeurNote() {
		return valeurNote;
	}
	public void setValeurNote(long valeurNote) {
		this.valeurNote = valeurNote;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public Date getDateNote() {
		return dateNote;
	}
	public void setDateNote(Date dateNote) {
		this.dateNote = dateNote;
	}
	public Competence getComptence() {
		return comptence;
	}
	public void setComptence(Competence comptence) {
		this.comptence = comptence;
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	

}
