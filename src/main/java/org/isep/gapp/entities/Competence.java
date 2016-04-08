package org.isep.gapp.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Competence implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idCompetence;
	private String nomCompetence;
	private String descriptionCompetence;
	private boolean bloqueCompetence;
	private long coefficient;
	@ManyToOne
	@JoinColumn(name="id_famille")
	private FamilleCompetence familleCompetence;
	
	public Competence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Competence(long idCompetence, String nomCompetence, String descriptionCompetence, boolean bloqueCompetence,
			long coefficient, FamilleCompetence familleCompetence) {
		super();
		this.idCompetence = idCompetence;
		this.nomCompetence = nomCompetence;
		this.descriptionCompetence = descriptionCompetence;
		this.bloqueCompetence = bloqueCompetence;
		this.coefficient = coefficient;
		this.familleCompetence = familleCompetence;
	}
	public long getIdCompetence() {
		return idCompetence;
	}
	public void setIdCompetence(long idCompetence) {
		this.idCompetence = idCompetence;
	}
	public String getNomCompetence() {
		return nomCompetence;
	}
	public void setNomCompetence(String nomCompetence) {
		this.nomCompetence = nomCompetence;
	}
	public String getDescriptionCompetence() {
		return descriptionCompetence;
	}
	public void setDescriptionCompetence(String descriptionCompetence) {
		this.descriptionCompetence = descriptionCompetence;
	}
	public boolean isBloqueCompetence() {
		return bloqueCompetence;
	}
	public void setBloqueCompetence(boolean bloqueCompetence) {
		this.bloqueCompetence = bloqueCompetence;
	}
	public long getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(long coefficient) {
		this.coefficient = coefficient;
	}
	public FamilleCompetence getFamilleCompetence() {
		return familleCompetence;
	}
	public void setFamilleCompetence(FamilleCompetence familleCompetence) {
		this.familleCompetence = familleCompetence;
	}
	
	

}
