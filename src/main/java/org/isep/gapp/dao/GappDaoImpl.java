package org.isep.gapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.isep.gapp.entities.AssignationsEquipe;
import org.isep.gapp.entities.Competence;
import org.isep.gapp.entities.Equipe;
import org.isep.gapp.entities.FamilleCompetence;
import org.isep.gapp.entities.Note;
import org.isep.gapp.entities.SessionApp;
import org.isep.gapp.entities.Utilisateur;

public class GappDaoImpl implements IGappDAO {
	@PersistenceContext
	private EntityManager em;

	@Override
	public Long ajouterCompetence(Competence c, Long idFamComp) {
		FamilleCompetence fc = getFamComp(idFamComp); 
		c.setFamilleCompetence(fc);
		em.persist(c);
		return c.getIdCompetence();
	}

	@Override
	public List<Competence> listComptence() {
		Query req = em.createQuery("select c from Competence c");
		return req.getResultList();
	}

	@Override
	public List<Competence> listCompetenceParMotCle(String mc) {
		Query req = em.createQuery("select c from Competence c where c.nomCompetence like :x or c.descriptionCompetence like :x");
		req.setParameter("x", "%"+mc+"%");
		return req.getResultList();
	}

	@Override
	public List<Competence> listCompetenceParFamComp(Long idFamComp) {
		Query req = em.createQuery("select c from Competence c where c.fammillecompetence.idFamille=:x");
		req.setParameter("x", idFamComp);
		return req.getResultList();
	}

	@Override
	public Competence getCompetence(Long idCompetence) {
		return em.find(Competence.class, idCompetence);
	}

	@Override
	public void supprimerComptence(Long idComp) {
		Competence c=getCompetence(idComp);
		em.remove(c);
		
	}

	@Override
	public void modifierCompetence(Competence c) {
		em.merge(c);
		
	}

	@Override
	public Long ajouterUtilisateur(Utilisateur u) {
		em.persist(u);
		return u.getIdUtilisateur();
		
	}

	@Override
	public List<Utilisateur> listUtilisateur() {
		Query req = em.createQuery("SELECT u FROM Utilisateur u");
		return req.getResultList();
	}

	@Override
	public List<Utilisateur> utilisateurParMotCle(String mc) {
		Query req = em.createQuery("select u from Utilisateur u where u.nomUtilisateur like :x or u.prenomUtilisateur like :x");
		req.setParameter("x", "%"+mc+"%");
		return req.getResultList();
	}

	@Override
	public Utilisateur getUtilisateur(Long idUtilisateur) {
		return em.find(Utilisateur.class, idUtilisateur);
	}

	@Override
	public void supprimerUtilisateur(Long idUtilisa) {
		Utilisateur u=getUtilisateur(idUtilisa);
		em.remove(u);
		
	}

	@Override
	public void modifierUtilisateur(Utilisateur u) {
		em.merge(u);
		
	}

	@Override
	public void attribuerRole(Long idUtilisateur) {
		
		
	}

	@Override
	public Long ajouterEquipe(Equipe e) {
		em.persist(e);
		return e.getIdEquipe();
	}

	@Override
	public List<Equipe> listEquipe() {
		Query req = em.createQuery("select e from Equipe e");
		return req.getResultList();
	}

	@Override
	public Equipe getEquipe(Long idEquipe) {
		return em.find(Equipe.class, idEquipe);
	}

	@Override
	public void supprimerEquipe(Long idEquip) {
		Equipe e=getEquipe(idEquip);
		em.remove(e);
		
	}

	@Override
	public void modifierEquipe(Equipe e) {
		em.merge(e);
		
	}

	@Override
	public Long ajouterFamComp(FamilleCompetence fc) {
		em.persist(fc);
		return fc.getIdFamille();
	}

	@Override
	public List<FamilleCompetence> listFamComp() {
		Query req=em.createQuery("select fc from FamilleCompetence fc");
		return req.getResultList();
	}

	@Override
	public FamilleCompetence getFamComp(Long idFamComp) {
		return em.find(FamilleCompetence.class, idFamComp);
	}

	@Override
	public void supprimerFamComp(Long idFamC) {
		FamilleCompetence fc = em.find(FamilleCompetence.class, idFamC);
		em.remove(fc);
		
	}

	@Override
	public void modifierFamComp(FamilleCompetence fc) {
		em.merge(fc);
		
	}

	@Override
	public Long ajouterNote(Note n) {
		em.persist(n);
		return n.getIdNote();
	}

	@Override
	public List<Note> listNote() {
		Query req=em.createQuery("select n from Note n");
		return req.getResultList();
	}

	@Override
	public Note getNote(Long idNote) {
		return em.find(Note.class, idNote);
	}

	@Override
	public void supprimerNote(Long idNt) {
		Note n = em.find(Note.class, idNt);
		em.remove(n);
		
	}

	@Override
	public void modifierNote(Note n) {
		em.merge(n);
		
	}

	@Override
	public void ajouterAssignEquipe(AssignationsEquipe ae) {
		em.persist(ae);
		
	}

	@Override
	public List<AssignationsEquipe> listAssignEquipe() {
		Query req=em.createQuery("select ae from AssignationsEquipe ae");
		return req.getResultList();
	}

	@Override
	public AssignationsEquipe getAssignEquipe(Long idAssignationsEquipe) {
		return em.find(AssignationsEquipe.class, idAssignationsEquipe);
	}

	@Override
	public void supprimerAssignEquipe(Long idAssignEqu) {
		AssignationsEquipe ae = em.find(AssignationsEquipe.class, idAssignEqu);
		em.remove(ae);
		
	}

	@Override
	public void modifierAssignEquipe(AssignationsEquipe ae) {
		em.merge(ae);
		
	}

	@Override
	public Long ajouterSessionApp(SessionApp sa) {
		em.persist(sa);
		return sa.getIdApp();
	}

	@Override
	public List<SessionApp> listSassionApp() {
		Query req=em.createQuery("SELECT sa FROM SessionApp sa");
		return req.getResultList();
	}

	@Override
	public SessionApp getSessionApp(Long idSessionApp) {
		return em.find(SessionApp.class, idSessionApp);
	}

	@Override
	public void supprimerSessionApp(Long idSessionA) {
		SessionApp sa = em.find(SessionApp.class, idSessionA);
		em.remove(sa);
		
	}

	@Override
	public void modifierSessionApp(SessionApp sa) {
		em.merge(sa);
		
	}

}
