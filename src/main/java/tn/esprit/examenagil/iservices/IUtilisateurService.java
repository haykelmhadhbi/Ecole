package tn.esprit.examenagil.iservices;

import tn.esprit.examenagil.entities.Utilisateur;

import java.util.List;

public interface IUtilisateurService {
    List<Utilisateur> getAllUtilisateurs(); // Récupérer tous les utilisateurs

    Utilisateur addUtilisateur(Utilisateur utilisateur); // Ajouter un utilisateur

    void deleteUtilisateur(Integer id); // Supprimer un utilisateur par son ID

    Utilisateur updateUtilisateur(Utilisateur utilisateur); // Mettre à jour un utilisateur

    Utilisateur getUtilisateurById(Integer idUtilisateur);
}
