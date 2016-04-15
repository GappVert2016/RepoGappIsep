package org.isep.gapp.dao;

import java.util.List;

import org.isep.gapp.entities.AssignationsEquipe;
import org.isep.gapp.entities.Competence;
import org.isep.gapp.entities.Equipe;
import org.isep.gapp.entities.FamilleCompetence;
import org.isep.gapp.entities.Note;
import org.isep.gapp.entities.SessionApp;
import org.isep.gapp.entities.Utilisateur;

public interface IGappDAO {
	public Long ajouterCompetence(Competence c, Long idFamComp);
	public List<Competence> listComptence();
	public List<Competence> listCompetenceParMotCle(String mc);
	public List<Competence> listCompetenceParFamComp(Long idFamComp);	
	public Competence getCompetence(Long idCompetence);
	public void supprimerComptence(Long idComp);
	public void modifierCompetence(Competence c);
	
	public Long ajouterUtilisateur(Utilisateur u);
	public List<Utilisateur> listUtilisateur();
	public List<Utilisateur> utilisateurParMotCle(String mc);	
	public Utilisateur getUtilisateur(Long idUtilisateur);
	public void supprimerUtilisateur(Long idUtilisa);
	public void modifierUtilisateur(Utilisateur u); 
	
	
	public void attribuerRole(Long idUtilisateur);
	
	public Long ajouterEquipe(Equipe e);
	public List<Equipe> listEquipe();
	public Equipe getEquipe(Long idEquipe);
	public void supprimerEquipe(Long idEquip);
	public void modifierEquipe(Equipe e);
	
	public Long ajouterFamComp(FamilleCompetence fc);
	public List<FamilleCompetence> listFamComp();
	public FamilleCompetence getFamComp(Long idFamComp);
	public void supprimerFamComp(Long idFamC);
	public void modifierFamComp(FamilleCompetence fc);
	
	public Long ajouterNote(Note n);
	public List<Note> listNote();
	public Note getNote(Long idNote);
	public void supprimerNote(Long idNt);
	public void modifierNote(Note n);
	
	public void ajouterAssignEquipe(AssignationsEquipe ae);
	public List<AssignationsEquipe> listAssignEquipe();
	public AssignationsEquipe getAssignEquipe(Long idAssignationsEquipe);
	public void supprimerAssignEquipe(Long idAssignEqu);
	public void modifierAssignEquipe(AssignationsEquipe ae);
	
	public Long ajouterSessionApp(SessionApp sa);
	public List<SessionApp> listSassionApp();
	public SessionApp getSessionApp(Long idSessionApp);
	public void supprimerSessionApp(Long idSessionA);
	public void modifierSessionApp(SessionApp sa);
		
}
