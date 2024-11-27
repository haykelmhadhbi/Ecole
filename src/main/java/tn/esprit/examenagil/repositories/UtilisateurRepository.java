package tn.esprit.examenagil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.examenagil.entities.Utilisateur;
import tn.esprit.examenagil.enumeration.Niveau;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer> {
    Integer countByClasseNiveau(Niveau niveau);

}
