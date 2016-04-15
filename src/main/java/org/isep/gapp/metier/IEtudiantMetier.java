package org.isep.gapp.metier;

import java.util.List;

import org.isep.gapp.entities.*;

public interface IEtudiantMetier {
	
	public List<Competence> listComptence();
	public List<Competence> listCompetenceParMotCle(String mc);
	public List<Competence> listCompetenceParFamComp(Long idFamComp);	
	public Competence getCompetence(Long idCompetence);
	
	public Utilisateur getUtilisateur(Long idUtilisateur);
	
	public List<FamilleCompetence> listFamComp();
	public FamilleCompetence getFamComp(Long idFamComp);
	
	public List<Note> listNote();
	public Note getNote(Long idNote);
	
	public List<AssignationsEquipe> listAssignEquipe();
	public AssignationsEquipe getAssignEquipe(Long idAssignationsEquipe);

}
