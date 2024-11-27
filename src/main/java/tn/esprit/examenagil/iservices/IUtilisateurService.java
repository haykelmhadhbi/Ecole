package tn.esprit.examenagil.iservices;

import tn.esprit.examenagil.entities.Utilisateur;
import tn.esprit.examenagil.enumeration.Niveau;

import java.util.List;

public interface IUtilisateurService {
    List<Utilisateur> getAllUtilisateurs(); // Récupérer tous les utilisateurs

    Utilisateur addUtilisateur(Utilisateur utilisateur); // Ajouter un utilisateur

    void deleteUtilisateur(Integer id); // Supprimer un utilisateur par son ID

    Utilisateur updateUtilisateur(Utilisateur utilisateur); // Mettre à jour un utilisateur

    Utilisateur getUtilisateurById(Integer idUtilisateur);
    public void affecterUtilisateurClasse (Integer idUtilisateur, Integer codeClasse);

    public Integer nbUtilisateursParNiveau(Niveau nv);


}
