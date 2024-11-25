package tn.esprit.examenagil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examenagil.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {
}
