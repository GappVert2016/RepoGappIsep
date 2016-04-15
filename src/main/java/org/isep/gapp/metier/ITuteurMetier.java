package org.isep.gapp.metier;

import java.util.List;

import org.isep.gapp.entities.*;

public interface ITuteurMetier extends IEtudiantMetier {
	
	public List<Utilisateur> listUtilisateur();
	public List<Utilisateur> utilisateurParMotCle(String mc);	
	public Utilisateur getUtilisateur(Long idUtilisateur);
	
	public Long ajouterNote(Note n);
	public void supprimerNote(Long idNt);
	public void modifierNote(Note n);

}
