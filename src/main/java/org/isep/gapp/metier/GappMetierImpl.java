package org.isep.gapp.metier;

import java.util.List;

import org.isep.gapp.dao.IGappDAO;
import org.isep.gapp.entities.AssignationsEquipe;
import org.isep.gapp.entities.Competence;
import org.isep.gapp.entities.Equipe;
import org.isep.gapp.entities.FamilleCompetence;
import org.isep.gapp.entities.Note;
import org.isep.gapp.entities.SessionApp;
import org.isep.gapp.entities.Utilisateur;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class GappMetierImpl implements IRespoAppMetier {

	private IGappDAO dao;
	
	public void setDao(IGappDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<Utilisateur> listUtilisateur() {
		return dao.listUtilisateur();
	}

	@Override
	public List<Utilisateur> utilisateurParMotCle(String mc) {
		return dao.utilisateurParMotCle(mc);
	}

	@Override
	public Utilisateur getUtilisateur(Long idUtilisateur) {
		return dao.getUtilisateur(idUtilisateur);
	}

	@Override
	public Long ajouterNote(Note n) {
		return ajouterNote(n);
	}

	@Override
	public void supprimerNote(Long idNt) {
		dao.supprimerNote(idNt);
		
	}

	@Override
	public void modifierNote(Note n) {
		dao.modifierNote(n);
		
	}

	@Override
	public List<Competence> listComptence(){
		return dao.listComptence();
	}

	@Override
	public List<Competence> listCompetenceParMotCle(String mc) {
		return dao.listCompetenceParMotCle(mc);
	}

	@Override
	public List<Competence> listCompetenceParFamComp(Long idFamComp) {
		return dao.listCompetenceParFamComp(idFamComp);
	}

	@Override
	public Competence getCompetence(Long idCompetence) {
		return dao.getCompetence(idCompetence);
	}

	@Override
	public List<FamilleCompetence> listFamComp() {
		return dao.listFamComp();
	}

	@Override
	public FamilleCompetence getFamComp(Long idFamComp) {
		return dao.getFamComp(idFamComp);
	}

	@Override
	public List<Note> listNote() {
		return dao.listNote();
	}

	@Override
	public Note getNote(Long idNote) {
		return dao.getNote(idNote);
	}

	@Override
	public List<AssignationsEquipe> listAssignEquipe() {
		return listAssignEquipe();
	}

	@Override
	public AssignationsEquipe getAssignEquipe(Long idAssignationsEquipe) {
		return dao.getAssignEquipe(idAssignationsEquipe);
	}

	@Override
	public Long ajouterCompetence(Competence c, Long idFamComp) {
		return dao.ajouterCompetence(c, idFamComp);
	}

	@Override
	public void supprimerComptence(Long idComp) {
		dao.supprimerComptence(idComp);
		
	}

	@Override
	public void modifierCompetence(Competence c) {
		dao.modifierCompetence(c);
		
	}

	@Override
	public Long ajouterUtilisateur(Utilisateur u) {
		return dao.ajouterUtilisateur(u);
		
	}

	@Override
	public void supprimerUtilisateur(Long idUtilisa) {
		dao.supprimerUtilisateur(idUtilisa);
		
	}

	@Override
	public void modifierUtilisateur(Utilisateur u) {
		dao.modifierUtilisateur(u);
		
	}

	@Override
	public void attribuerRole(Long idUtilisateur) {
		
	}

	@Override
	public Long ajouterEquipe(Equipe e) {
		return dao.ajouterEquipe(e);
	}

	@Override
	public List<Equipe> listEquipe() {
		return dao.listEquipe();
	}

	@Override
	public Equipe getEquipe(Long idEquipe) {
		return dao.getEquipe(idEquipe);
	}

	@Override
	public void supprimerEquipe(Long idEquip) {
		dao.supprimerEquipe(idEquip);
		
	}

	@Override
	public void modifierEquipe(Equipe e) {
		dao.modifierEquipe(e);
		
	}

	@Override
	public Long ajouterFamComp(FamilleCompetence fc) {
		return dao.ajouterFamComp(fc);
	}

	@Override
	public void supprimerFamComp(Long idFamC) {
		dao.supprimerFamComp(idFamC);
		
	}

	@Override
	public void modifierFamComp(FamilleCompetence fc) {
		dao.modifierFamComp(fc);
		
	}

	@Override
	public void ajouterAssignEquipe(AssignationsEquipe ae) {
		dao.ajouterAssignEquipe(ae);
		
	}

	@Override
	public void supprimerAssignEquipe(Long idAssignEqu) {
		dao.supprimerAssignEquipe(idAssignEqu);
		
	}

	@Override
	public void modifierAssignEquipe(AssignationsEquipe ae) {
		dao.modifierAssignEquipe(ae);
		
	}

	@Override
	public Long ajouterSessionApp(SessionApp sa) {
		return dao.ajouterSessionApp(sa);
	}

	@Override
	public List<SessionApp> listSassionApp() {
		return dao.listSassionApp();
	}

	@Override
	public SessionApp getSessionApp(Long idSessionApp) {
		return dao.getSessionApp(idSessionApp);
	}

	@Override
	public void supprimerSessionApp(Long idSessionA) {
		dao.supprimerSessionApp(idSessionA);
		
	}

	@Override
	public void modifierSessionApp(SessionApp sa) {
		dao.modifierSessionApp(sa);
		
	}

}
